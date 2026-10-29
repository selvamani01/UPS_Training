


import java.sql.*;
import java.util.Scanner;

public class HospitalManagementSystem {

    static final String URL =
            "jdbc:mysql://localhost:3306/hospital_db";
    static final String USER = "root";
    static final String PASSWORD = "Selvamani1234";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try (Connection con =
                DriverManager.getConnection(URL, USER, PASSWORD)) {

            System.out.println("=== HOSPITAL MANAGEMENT SYSTEM ===");

            createTable(con);

            int choice=0;

            do {
                System.out.println("\n1. Add Patient");
                System.out.println("2. View All Patients");
                System.out.println("3. Search Patient");
                System.out.println("4. Update Patient Disease");
                System.out.println("5. Delete Patient");
                System.out.println("6. Exit");
                System.out.print("Enter choice: ");

                try {
                    choice = Integer.parseInt(sc.nextLine().trim());
                } catch (NumberFormatException e) {
                    System.out.println("Enter a valid number.");
                    continue;
                }

                try {
                    switch (choice) {
                        case 1:
                            addPatient(con, sc);
                            break;
                        case 2:
                            viewPatients(con);
                            break;
                        case 3:
                            searchPatient(con, sc);
                            break;
                        case 4:
                            updatePatient(con, sc);
                            break;
                        case 5:
                            deletePatient(con, sc);
                            break;
                        case 6:
                            System.out.println("Thank you!");
                            break;
                        default:
                            System.out.println("Choose 1 to 6.");
                    }
                } catch (SQLException e) {
                    System.out.println("Database error: " + e.getMessage());
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid number.");
                }

            } while (choice != 6);

        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
        }

        sc.close();
    }

    // Create the table automatically
    static void createTable(Connection con) throws SQLException {

        String sql = """
                CREATE TABLE IF NOT EXISTS patients (
                    id INT PRIMARY KEY,
                    name VARCHAR(100) NOT NULL,
                    age INT NOT NULL,
                    gender VARCHAR(15),
                    disease VARCHAR(100),
                    phone VARCHAR(15)
                )
                """;

        try (Statement st = con.createStatement()) {
            st.executeUpdate(sql);
        }
    }

    // Add a patient
    static void addPatient(Connection con, Scanner sc)
            throws SQLException {

        System.out.print("Patient ID: ");
        int id = Integer.parseInt(sc.nextLine().trim());

        System.out.print("Patient name: ");
        String name = sc.nextLine().trim();

        System.out.print("Age: ");
        int age = Integer.parseInt(sc.nextLine().trim());

        System.out.print("Gender: ");
        String gender = sc.nextLine().trim();

        System.out.print("Disease: ");
        String disease = sc.nextLine().trim();

        System.out.print("Phone: ");
        String phone = sc.nextLine().trim();

        String sql = """
                INSERT INTO patients
                (id, name, age, gender, disease, phone)
                VALUES (?, ?, ?, ?, ?, ?)
                """;

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, age);
            ps.setString(4, gender);
            ps.setString(5, disease);
            ps.setString(6, phone);

            ps.executeUpdate();
            System.out.println("Patient added successfully.");
        }
    }

    // Display all patients
    static void viewPatients(Connection con) throws SQLException {

        String sql = "SELECT * FROM patients ORDER BY id";

        try (Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            boolean found = false;

            while (rs.next()) {
                found = true;
                displayPatient(rs);
            }

            if (!found) {
                System.out.println("No patient records found.");
            }
        }
    }

    // Search by patient ID
    static void searchPatient(Connection con, Scanner sc)
            throws SQLException {

        System.out.print("Enter patient ID: ");
        int id = Integer.parseInt(sc.nextLine().trim());

        String sql = "SELECT * FROM patients WHERE id = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    displayPatient(rs);
                } else {
                    System.out.println("Patient not found.");
                }
            }
        }
    }

    // Update a patient's disease
    static void updatePatient(Connection con, Scanner sc)
            throws SQLException {

        System.out.print("Enter patient ID: ");
        int id = Integer.parseInt(sc.nextLine().trim());

        System.out.print("Enter updated disease: ");
        String disease = sc.nextLine().trim();

        String sql = "UPDATE patients SET disease = ? WHERE id = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, disease);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Patient details updated.");
            } else {
                System.out.println("Patient not found.");
            }
        }
    }

    // Delete a patient
    static void deletePatient(Connection con, Scanner sc)
            throws SQLException {

        System.out.print("Enter patient ID to delete: ");
        int id = Integer.parseInt(sc.nextLine().trim());

        String sql = "DELETE FROM patients WHERE id = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Patient deleted successfully.");
            } else {
                System.out.println("Patient not found.");
            }
        }
    }

    // Display one patient's details
    static void displayPatient(ResultSet rs) throws SQLException {

        System.out.println("\n-------------------------");
        System.out.println("Patient ID : " + rs.getInt("id"));
        System.out.println("Name       : " + rs.getString("name"));
        System.out.println("Age        : " + rs.getInt("age"));
        System.out.println("Gender     : " + rs.getString("gender"));
        System.out.println("Disease    : " + rs.getString("disease"));
        System.out.println("Phone      : " + rs.getString("phone"));
        System.out.println("-------------------------");
    }
}
