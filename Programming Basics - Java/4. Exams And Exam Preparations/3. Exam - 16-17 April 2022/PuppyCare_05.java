package FinalExamApril2022;

import java.util.Scanner;

public class PuppyCare_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int availableFood = Integer.parseInt(scanner.nextLine()) * 1000;

        int totalEatenFood = 0;
        String input = scanner.nextLine();
        boolean outOfFood = false;

        while (!input.equals("Adopted")) {
            int eatenFood = Integer.parseInt(input);
            totalEatenFood += eatenFood;
            input = scanner.nextLine();
        }

        if (totalEatenFood > availableFood) {
            System.out.printf("Food is not enough. You need %d grams more.", totalEatenFood - availableFood);
        } else {
            System.out.printf("Food is enough! Leftovers: %d grams.", availableFood - totalEatenFood);
        }
    }
}