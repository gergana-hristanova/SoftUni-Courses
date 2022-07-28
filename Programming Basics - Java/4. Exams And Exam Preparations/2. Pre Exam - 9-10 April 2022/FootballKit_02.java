package PreExamApril2022;

import java.util.Scanner;

public class FootballKit_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double tshirtPrice = Double.parseDouble(scanner.nextLine());
        double neededSum = Double.parseDouble(scanner.nextLine());

        double shortsPrice = tshirtPrice * 0.75;
        double socksPrice = shortsPrice * 0.2;
        double bootsPrice = (tshirtPrice + shortsPrice) * 2;

        double totalPrice = tshirtPrice + shortsPrice + socksPrice + bootsPrice;
        totalPrice -= totalPrice * 0.15;

        if (totalPrice >= neededSum) {
            System.out.printf("Yes, he will earn the world-cup replica ball!%n" +
                    "His sum is %.2f lv.", totalPrice);
        } else {
            System.out.printf("No, he will not earn the world-cup replica ball.%n" +
                    "He needs %.2f lv. more.", neededSum - totalPrice);
        }
    }
}