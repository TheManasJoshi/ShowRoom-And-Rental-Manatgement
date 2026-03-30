import java.util.*;

public class ShowroomService {
    ArrayList<Car> cars = new ArrayList<>();
    ArrayList<Rental> rentals = new ArrayList<>();

    void addCar(Car car) {
        cars.add(car);
    }

    void displayCars() {
        for (Car c : cars) {
            c.displayCar();
        }
    }

    Car getCarById(int id) {
        for (Car c : cars) {
            if (c.id == id) return c;
        }
        return null;
    }

    void rentCar(int id, Customer customer, int days) {
        Car car = getCarById(id);

        if (car != null && car.isAvailable) {
            car.isAvailable = false;
            Rental rental = new Rental(car, customer, days);
            rentals.add(rental);

            System.out.println("Car rented!");
            System.out.println("Cost: ₹" + rental.calculateCost());
        } else {
            System.out.println("Car not available!");
        }
    }

    void returnCar(int id) {
        Car car = getCarById(id);

        if (car != null) {
            car.isAvailable = true;
            System.out.println("Car returned!");
        }
    }

  
    void searchCar(String brand) {
        for (Car c : cars) {
            if (c.brand.equalsIgnoreCase(brand)) {
                c.displayCar();
            }
        }
    }
}