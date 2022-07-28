package FirstStepsInCoding_01;

import java.util.Scanner;

public class FoodDelivery_07 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int veggieMenu = Integer.parseInt(scanner.nextLine());

        double chickenCost = chickenMenu * 10.35;
        double fishCost = fishMenu * 12.4;
        double veggieCost = veggieMenu * 8.15;

        double menusCost = chickenCost + fishCost + veggieCost;
        double desertCost = menusCost * 0.2;
        double totalCost = menusCost + desertCost + 2.5;

        System.out.println(totalCost);
    }
}