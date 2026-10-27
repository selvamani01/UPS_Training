class Child {
    String name;
    int age;

    Child(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Child Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Child c = new Child("Arun", 10);
        c.display();
    }
}