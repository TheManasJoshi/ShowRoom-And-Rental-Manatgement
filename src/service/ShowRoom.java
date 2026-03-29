import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShowroomService service = new ShowroomService();

        // Sample data
        service.addCar(new Car(1, "Toyota", "Fortuner", 3000));
        service.addCar(new Car(2, "BMW", "X5", 7000));

        while (true) {
            System.out.println("\n--- Car Showroom System ---");
            System.out.println("1. View Cars");
            System.out.println("2. Rent Car");
            System.out.println("3. Return Car");
            System.out.println("4. Search Car");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    service.displayCars();
                    break;

                case 2:
                    System.out.print("Enter Car ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Days: ");
                    int days = sc.nextInt();

                    service.rentCar(id, new Customer(1, name), days);
                    break;

                case 3:
                    System.out.print("Enter Car ID: ");
                    service.returnCar(sc.nextInt());
                    break;

                case 4:
                    sc.nextLine();
                    System.out.print("Enter Brand: ");
                    service.searchCar(sc.nextLine());
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}