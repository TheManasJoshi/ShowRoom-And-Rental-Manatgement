public class Rental {
    Car car;
    Customer customer;
    int days;

    Rental(Car car, Customer customer, int days) {
        this.car = car;
        this.customer = customer;
        this.days = days;
    }

    double calculateCost() {
        return car.pricePerDay * days;
    }
}