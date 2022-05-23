package FirstStepsInCoding_01;

import java.util.Scanner;

public class PetShop_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int dogFood = Integer.parseInt(scanner.nextLine());
        int catFood = Integer.parseInt(scanner.nextLine());

        double dogFoodCost = dogFood * 2.5;
        double catFoodCost = catFood * 4.0;
        double finalCost = dogFoodCost + catFoodCost;

        System.out.println(finalCost + " lv.");
    }
}