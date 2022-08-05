package final_exam_retake_03;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NeedForSpeedIII_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, int[]> carsMap = new LinkedHashMap<>();

        int numberOfCars = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfCars; i++) {
            String[] input = scanner.nextLine().split("\\|");
            int[] value = new int[2];
            value[0] = Integer.parseInt(input[1]);
            value[1] = Integer.parseInt(input[2]);

            carsMap.put(input[0], value);
        }

        String[] commandLine = scanner.nextLine().split(" : ");
        while (!commandLine[0].equals("Stop")) {

            String command = commandLine[0];
            String car = commandLine[1];

            switch (command) {
                case "Drive":
                    int distance = Integer.parseInt(commandLine[2]);
                    int neededFuel = Integer.parseInt(commandLine[3]);
                    int availableFuel = carsMap.get(car)[1];

                    if (neededFuel > availableFuel) {
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        carsMap.get(car)[0] += distance;
                        carsMap.get(car)[1] -= neededFuel;

                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n",
                                car, distance, neededFuel);

                        int mileage = carsMap.get(car)[0];
                        if (mileage >= 100000) {
                            carsMap.remove(car);
                            System.out.printf("Time to sell the %s!%n", car);
                        }
                    }
                    break;

                case "Refuel":
                    int fuel = Integer.parseInt(commandLine[2]);
                    int currentFuel = carsMap.get(car)[1];

                    if (fuel + currentFuel > 75) {
                        carsMap.get(car)[1] = 75;
                        System.out.printf("%s refueled with %d liters%n",
                                car, 75 - currentFuel);
                    } else {
                        carsMap.get(car)[1] += fuel;
                        System.out.printf("%s refueled with %d liters%n",
                                car, fuel);
                    }
                    break;

                case "Revert":
                    int kilometers = Integer.parseInt(commandLine[2]);

                    carsMap.get(car)[0] -= kilometers;

                    if (carsMap.get(car)[0] < 10000) {
                        carsMap.get(car)[0] = 10000;
                    } else {
                        System.out.printf("%s mileage decreased by %s kilometers%n",
                                car, kilometers);
                    }
                    break;
            }

            commandLine = scanner.nextLine().split(" : ");
        }

        for (Map.Entry<String, int[]> entry : carsMap.entrySet()) {
            String car = entry.getKey();
            int mileage = entry.getValue()[0];
            int fuel = entry.getValue()[1];

            System.out.printf("%s -> Mileage: %s kms, Fuel in the tank: %s lt.%n",
                    car, mileage, fuel);
        }
    }
}