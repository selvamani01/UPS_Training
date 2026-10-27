class Student {
    int rollNo;
    String name;
    double mark;

    Student(int rollNo, String name, double mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }

    void display() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Mark: " + mark);
    }

    public static void main(String[] args) {
        Student s = new Student(1, "Kumar", 90.5);
        s.display();
    }
}