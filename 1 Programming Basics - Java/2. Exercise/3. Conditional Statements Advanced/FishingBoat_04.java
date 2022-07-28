package ConditionalStatementsAdvanced_03;

import java.util.Scanner;

public class FishingBoat_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //въвеждаме данните
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());
        //инициализираме променлива за цената
        double cost = 0;
        //проверяваме сезона
        switch (season) {
            case "Spring":
                cost = 3000;
                //проверяваме за отстъпка за брой рибари
                if (fishermen <= 6) {
                    cost -= cost * 0.1;
                } else if (fishermen <= 11) {
                    cost -= cost * 0.15;
                } else {
                    cost -= cost * 0.25;
                }
                //проверяваме за отстъпка за четен брой рибари
                if (fishermen % 2 == 0) {
                    cost -= cost * 0.05;
                }
                break;
            case "Summer":
                cost = 4200;
                if (fishermen <= 6) {
                    cost -= cost * 0.1;
                } else if (fishermen <= 11) {
                    cost -= cost * 0.15;
                } else {
                    cost -= cost * 0.25;
                }
                if (fishermen % 2 == 0) {
                    cost -= cost * 0.05;
                }
                break;
            case "Autumn":
                cost = 4200;
                if (fishermen <= 6) {
                    cost -= cost * 0.10;
                } else if (fishermen <= 11) {
                    cost -= cost * 0.15;
                } else {
                    cost -= cost * 0.25;
                }
                //тук не проверяваме отстъпка за четен брой рибари
                break;
            case "Winter":
                cost = 2600;
                if (fishermen <= 6) {
                    cost -= cost * 0.1;
                } else if (fishermen <= 11) {
                    cost -= cost * 0.15;
                } else {
                    cost -= cost * 0.25;
                }
                if (fishermen % 2 == 0) {
                    cost -= cost * 0.05;
                }
                break;
        }
        //изчисляваме разликата между бюджета и цената
        double diff = Math.abs(budget - cost);
        //проверяваме дали бюджета е достатъчен
        if (budget >= cost) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}