class Calculator {
    int a;
    int b;

    Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void add() {
        System.out.println("Sum: " + (a + b));
    }

    void subtract() {
        System.out.println("Difference: " + (a - b));
    }

    void multiply() {
        System.out.println("Product: " + (a * b));
    }

    void divide() {
        if (b != 0) {
            System.out.println("Quotient: " + ((double) a / b));
        } else {
            System.out.println("Cannot divide by zero");
        }
    }

    public static void main(String[] args) {
        Calculator c = new Calculator(20, 5);

        c.add();
        c.subtract();
        c.multiply();
        c.divide();
    }
}