package ConditionalStatements_02;

import java.util.Scanner;

public class Shopping_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //въвеждаме данните
        double budget = Double.parseDouble(scanner.nextLine());
        int GPUs = Integer.parseInt(scanner.nextLine());
        int CPUs = Integer.parseInt(scanner.nextLine());
        int RAMs = Integer.parseInt(scanner.nextLine());

        //изчисляваме цените на закупените продукти
        double gpuPrice = GPUs * 250;
        double cpuPrice = gpuPrice * 0.35 * CPUs;
        double ramPrice = gpuPrice * 0.10 * RAMs;

        //изчисляваме цялата цена
        double totalPrice = gpuPrice + cpuPrice + ramPrice;
        //проверяваме дали видеокартите са повече от процесорите
        if (GPUs > CPUs) {
            //ако са, изваждаме от цялата цена 15% (отстъпка)
            totalPrice -= totalPrice * 0.15;
        }

        //изчисляваме разликата между бюджета и цялата цена
        double diff = Math.abs(budget - totalPrice);

        //проверяваме дали цялата цена надвижава бюджета
        if (budget >= totalPrice) {
            System.out.printf("You have %.2f leva left!", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", diff);
        }
    }
}