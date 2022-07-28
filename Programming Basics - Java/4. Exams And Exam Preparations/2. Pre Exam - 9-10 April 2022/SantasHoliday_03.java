package PreExamApril2022;

import java.util.Scanner;

public class SantasHoliday_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String review = scanner.nextLine();

        int overnightCost = 0;
        switch (roomType) {
            case "room for one person":
                overnightCost = 18;
                break;
            case "apartment":
                overnightCost = 25;
                break;
            case "president apartment":
                overnightCost = 35;
                break;
        }
        double totalCost = (days - 1) * overnightCost;

        if (roomType.equals("apartment")) {
            if (days < 10) {
                totalCost -= totalCost * 0.3;
            } else if (days < 15) {
                totalCost -= totalCost * 0.35;
            } else {
                totalCost -= totalCost * 0.50;
            }
        } else if (roomType.equals("president apartment")) {
            if (days < 10) {
                totalCost -= totalCost * 0.1;
            } else if (days < 15) {
                totalCost -= totalCost * 0.15;
            } else {
                totalCost -= totalCost * 0.20;
            }
        }

        if (review.equals("positive")) {
            totalCost += totalCost * 0.25;
        } else {
            totalCost -= totalCost * 0.1;
        }

        System.out.printf("%.2f", totalCost);
    }
}