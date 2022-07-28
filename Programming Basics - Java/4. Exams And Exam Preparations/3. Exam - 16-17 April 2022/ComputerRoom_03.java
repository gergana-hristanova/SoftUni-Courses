package FinalExamApril2022;

import java.util.Scanner;

public class ComputerRoom_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int hours = Integer.parseInt(scanner.nextLine());
        int members = Integer.parseInt(scanner.nextLine());
        String timeOfDay = scanner.nextLine();

        double price = 0;
        boolean marchMay = false;
        switch (month) {
            case "march":
            case "april":
            case "may":
                marchMay = true;
                break;
        }
        if (marchMay) {
            if (timeOfDay.equals("day")) {
                price = 10.50;
            } else {
                price = 8.40;
            }
        } else {
            if (timeOfDay.equals("day")) {
                price = 12.60;
            } else {
                price = 10.20;
            }
        }
        if (members >= 4) {
            price -= price * 0.10;
        }
        if (hours >= 5) {
            price -= price * 0.50;
        }
        System.out.printf("Price per person for one hour: %.2f%n", price);
        System.out.printf("Total cost of the visit: %.2f", price * hours * members);
    }
}