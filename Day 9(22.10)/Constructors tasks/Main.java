class Main {
    int number;
    String message;

    Main() {
        number = 0;
        message = "Default Constructor";
    }

    Main(int number, String message) {
        this.number = number;
        this.message = message;
    }

    void display() {
        System.out.println("Number: " + number);
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        Main obj1 = new Main();
        Main obj2 = new Main(100, "Parameterized Constructor");

        obj1.display();
        System.out.println();

        obj2.display();
    }
}