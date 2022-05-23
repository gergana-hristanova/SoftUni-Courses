package ConditionalStatements_02;

import java.util.Scanner;

public class Pets_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //въвеждаме данните
        int days = Integer.parseInt(scanner.nextLine());
        int totalLeftFoodKg = Integer.parseInt(scanner.nextLine());
        double dogFoodPerDayKg = Double.parseDouble(scanner.nextLine());
        double catFoodPerDayKg = Double.parseDouble(scanner.nextLine());
        double turtleFoodPerDayG = Double.parseDouble(scanner.nextLine());

        //превръщаме храната за костенурката в килограми
        double turtleFoodPerDayKg = turtleFoodPerDayG / 1000;

        //изчисляваме храната, изяждаща се за един ден
        double totalFoodPerDayKg = dogFoodPerDayKg + catFoodPerDayKg + turtleFoodPerDayKg;
        //изчисляваме цялата изядена храна
        double totalEatenFoodKg = totalFoodPerDayKg * days;
        //изчисляваме разликата между изядената и оставената храта
        double diff = Math.abs(totalEatenFoodKg - totalLeftFoodKg);

        //проверяваме дали изядената храна не надвишава оставената
        if (totalEatenFoodKg <= totalLeftFoodKg) {
            System.out.printf("%.0f kilos of food left.", Math.floor(diff));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(diff));
        }
    }
}