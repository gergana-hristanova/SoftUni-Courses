package NestedLoops_06;

import java.util.Scanner;

public class HappyCatParking_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hoursPerDay = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;

        for (int currentDay = 1; currentDay <= days; currentDay++) {
            double pricePerDay = 0;
            double pricePerHour;
            for (int currentHour = 1; currentHour <= hoursPerDay; currentHour++) {
                if (currentDay % 2 == 0 && currentHour % 2 != 0) {
                    pricePerHour = 2.50;
                } else if (currentDay % 2 != 0 && currentHour % 2 == 0) {
                    pricePerHour = 1.25;
                } else {
                    pricePerHour = 1.00;
                }
                pricePerDay += pricePerHour;
            }
            totalPrice += pricePerDay;
            System.out.printf("Day: %d - %.2f leva%n", currentDay, pricePerDay);
        }
        System.out.printf("Total: %.2f leva", totalPrice);
    }
}