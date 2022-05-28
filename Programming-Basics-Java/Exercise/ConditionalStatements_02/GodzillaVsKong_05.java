package ConditionalStatements_02;

import java.util.Scanner;

public class GodzillaVsKong_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //въвеждаме данните
        double budget = Double.parseDouble(scanner.nextLine());
        int extras = Integer.parseInt(scanner.nextLine());
        double outfitPricePerExtra = Double.parseDouble(scanner.nextLine());

        //изчисляваме цената на декора
        double decorPrice = budget * 0.1;

        //изчисляваме цената на облеклата на статистите
        double totalOutfitPrice = extras * outfitPricePerExtra;
        //проверяваме дали статистите са повече от 150
        if (extras > 150) {
            //ако са, изваждаме 10% от цената на облеклата (отстъпка)
            totalOutfitPrice -= totalOutfitPrice * 0.1;
        }

        //изчисляваме крайната цена
        double totalPrice = totalOutfitPrice + decorPrice;
        //изчисляваме разликата между бюджета и крайната цена
        double diff = Math.abs(budget - totalPrice);

        //проверяваме дали бюджета е по-малък от крайната цена
        if (budget < totalPrice) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", diff);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", diff);
        }
    }
}