package ConditionalStatementsAdvanced_03;

import java.util.Scanner;

public class Flowers_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //въвеждаме данните
        int chrysanthemumsAmount = Integer.parseInt(scanner.nextLine());
        int rosesAmount = Integer.parseInt(scanner.nextLine());
        int tulipsAmount = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holidayOrNot = scanner.nextLine();
        //дефинираме променливи за цените на:
        double chrysanthemumsCost = 0; //хризантемите
        double rosesCost = 0; //розите
        double tulipsCost = 0; //лалетата
        //проверяваме сезона
        switch (season) {
            case "Spring":
            case "Summer":
                chrysanthemumsCost = 2;
                rosesCost = 4.10;
                tulipsCost = 2.50;
                break;
            case "Autumn":
            case "Winter":
                chrysanthemumsCost = 3.75;
                rosesCost = 4.50;
                tulipsCost = 4.15;
                break;
        }
        //изчисляваме цената на букета
        double bouquetCost = chrysanthemumsCost * chrysanthemumsAmount +
                             rosesCost * rosesAmount +
                             tulipsCost * tulipsAmount;
        //проверяваме дали е празник
        if (holidayOrNot.equals("Y")) {
            bouquetCost += bouquetCost * 0.15;
        }
        //проверяваме за отстъпки
        if (season.equals("Spring") && tulipsAmount > 7) {
            bouquetCost -= bouquetCost * 0.05;
        }
        if (season.equals("Winter") && rosesAmount >= 10) {
            bouquetCost -= bouquetCost * 0.10;
        }
        if (chrysanthemumsAmount + rosesAmount + tulipsAmount > 20) {
            bouquetCost -= bouquetCost * 0.20;
        }
        //извеждаме резултата
        System.out.printf("%.2f", bouquetCost + 2);
    }
}