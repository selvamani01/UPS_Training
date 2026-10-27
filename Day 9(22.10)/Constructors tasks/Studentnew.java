class Studentnew {
    int rollNo;
    String name;

    Studentnew() {
        rollNo = 0;
        name = "Unknown";
    }

    Studentnew(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void display() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Studentnew s1 = new Studentnew();
        Studentnew s2 = new Studentnew(102, "Priya");

        s1.display();
        System.out.println();

        s2.display();
    }
}