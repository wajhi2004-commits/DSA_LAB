class Car {
    String brand;
    String model;
    double price;

    Car(String b, String m, double p) {
        brand = b;
        model = m;
        price = p;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: $" + price);
    }
}

