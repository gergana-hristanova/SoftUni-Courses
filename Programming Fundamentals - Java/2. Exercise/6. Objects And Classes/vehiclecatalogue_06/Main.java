package vehiclecatalogue_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> vehicleList = new ArrayList<>();
        int trucksHorsepowerSum = 0;
        double truckCount = 0;
        int carsHorsepowerSum = 0;
        double carsCount = 0;

        String[] vehicleData = scanner.nextLine().split(" ");
        while (!vehicleData[0].equals("End")) {
            String vehicleType = vehicleData[0];
            String vehicleModel = vehicleData[1];
            String vehicleColor = vehicleData[2];
            int vehicleHorsepower = Integer.parseInt(vehicleData[3]);

            Vehicle vehicle = new Vehicle(vehicleType, vehicleModel, vehicleColor, vehicleHorsepower);
            vehicleList.add(vehicle);

            if (vehicle.getType().equals("Truck")) {
                trucksHorsepowerSum += vehicle.getHorsepower();
                truckCount++;
            } else {
                carsHorsepowerSum += vehicle.getHorsepower();
                carsCount++;
            }

            vehicleData = scanner.nextLine().split(" ");
        }

        String vehicleModel = scanner.nextLine();
        while (!vehicleModel.equals("Close the Catalogue")) {
            for (Vehicle vehicle : vehicleList) {
                if (vehicleModel.equals(vehicle.getModel())) {
                    System.out.println("Type: " + vehicle.getType());
                    System.out.println("Model: " + vehicle.getModel());
                    System.out.println("Color: " + vehicle.getColor());
                    System.out.println("Horsepower: " + vehicle.getHorsepower());
                }
            }

            vehicleModel = scanner.nextLine();
        }

        if (carsCount == 0) {
            carsCount = 1;
        }
        if (truckCount == 0) {
            truckCount = 1;
        }

        System.out.printf("Cars have average horsepower of: %.2f.%n",
                carsHorsepowerSum / carsCount);
        System.out.printf("Trucks have average horsepower of: %.2f.%n",
                trucksHorsepowerSum / truckCount);
    }
}