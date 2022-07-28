package WhileLoop_05;

import java.util.Scanner;

public class ReportSystem_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int neededMoney = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        int cashOrCardCounter = 0;
        int collectedMoney = 0;
        double cashCounter = 0;
        double cardCounter = 0;
        int cashMoneyCounter = 0;
        int cardMoneyCounter = 0;
        boolean notFailed = false;

        while (!input.equals("End")) {
            cashOrCardCounter++;
            int productPrice = Integer.parseInt(input);

            if (cashOrCardCounter % 2 != 0) {
                if (productPrice > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    collectedMoney += productPrice;
                    cashMoneyCounter += productPrice;
                    cashCounter++;
                }
            } else {
                if (productPrice < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    collectedMoney += productPrice;
                    cardMoneyCounter += productPrice;
                    cardCounter++;
                }
            }

            if (collectedMoney >= neededMoney) {
                notFailed = true;
                break;
            } else {
                input = scanner.nextLine();
            }
        }

        if (notFailed) {
            double cashAverage = cashMoneyCounter / cashCounter;
            double cardAverage = cardMoneyCounter / cardCounter;
            System.out.printf("Average CS: %.2f%n", cashAverage);
            System.out.printf("Average CC: %.2f", cardAverage);
        } else {
            System.out.println("Failed to collect required money for charity.");
        }
    }
}