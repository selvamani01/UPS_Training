
class NewDemo {

    static int add(int a, int b) {
        return a + b;
    }

    static void display() {
        System.out.println("Welcome to Java Methods");
    }

    public static void main(String[] args) {
        display();

        int result = add(10, 20);
        System.out.println("Sum = " + result);
    }
}
