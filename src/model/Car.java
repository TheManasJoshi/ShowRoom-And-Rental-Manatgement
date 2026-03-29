class Car {
    int id;
    String brand;
    String model;
    double pricePerDay;
    boolean isAvailable;

    Car(int id, String brand, String model, double pricePerDay) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.pricePerDay = pricePerDay;
        this.isAvailable = true;
    }

    void displayCar() {
        System.out.println(id + " | " + brand + " " + model +
                " | ₹" + pricePerDay + "/day | Available: " + isAvailable);
    }
}