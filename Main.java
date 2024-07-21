import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> rentedVehicles = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Vehicle Rental System");
            System.out.println("1. Rent a Car");
            System.out.println("2. Rent a Bike");
            System.out.println("3. Rent a Truck");
            System.out.println("4. View Rented Vehicles");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println(" Please enter a number.");
                scanner.nextLine();
                continue;
            }
            switch (choice) {
                case 1:
                    System.out.print("Enter Car Model: ");
                    String carModel = scanner.nextLine();
                    System.out.print("Enter Rental Days: ");
                    int rentalDays;

                    try {
                        rentalDays = scanner.nextInt();
                        scanner.nextLine();
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input for rental days. Please enter a number.");
                        scanner.nextLine();
                        break;
                    }

                    Vehicle vehicle1 = new Car(carModel, rentalDays);
                    rentedVehicles.add(vehicle1);
                    System.out.println("Rental Details:");
                    vehicle1.displayDetails();
                    break;
                case 2:
                    System.out.print("Enter Bike Brand: ");
                    String bikeBrand = scanner.nextLine();
                    System.out.print("Enter Rental Hours: ");
                    int rentalHours;

                    try {
                        rentalHours = scanner.nextInt();
                        scanner.nextLine();
                    } catch (InputMismatchException e) {
                        System.out.println(" Please enter a number.");
                        scanner.nextLine();
                        break;
                    }

                    Vehicle bike = new Bike(bikeBrand, rentalHours);
                    rentedVehicles.add(bike);
                    System.out.println("Rental Details:");
                    bike.displayDetails();
                    break;
                case 3:
                    System.out.print("Enter Truck Type: ");
                    String truckType = scanner.nextLine();
                    System.out.print("Enter Rental Weeks: ");
                    int rentalWeeks;

                    try {
                        rentalWeeks = scanner.nextInt();
                        scanner.nextLine();
                    } catch (InputMismatchException e) {
                        System.out.println(" Please enter a number.");
                        scanner.nextLine();
                        break;
                    }
                    Vehicle truck = new Truck(truckType, rentalWeeks);
                    rentedVehicles.add(truck);
                    System.out.println("Rental Details:");
                    truck.displayDetails();
                    break;
                case 4:
                    System.out.println("Rented Vehicles:");
                    for (Vehicle vehicle : rentedVehicles) {
                        vehicle.displayDetails();
                    }
                    break;
                case 5:
                    System.out.println("Thank you for using the Vehicle Rental System!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 5);

        scanner.close();

    }}