class Mobile {
    String brand;
    String model;
    double price;

    Mobile(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Mobile m = new Mobile("Samsung", "Galaxy", 20000.0);
        m.display();
    }
}