class Dog {
    String name;
    String breed;

    Dog() {
        name = "Bruno";
        breed = "Labrador";
    }

    void display() {
        System.out.println("Dog Name: " + name);
        System.out.println("Breed: " + breed);
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}