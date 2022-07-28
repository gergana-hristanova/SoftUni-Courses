package FinalExamApril2022;

import java.util.Scanner;

public class CatFood_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int catsAmount = Integer.parseInt(scanner.nextLine());

        int smallCats = 0;
        int bigCats = 0;
        int omegaCats = 0;
        int totalEatenGrams = 0;

        for (int i = 1; i <= catsAmount; i++) {
            int eatenGrams = Integer.parseInt(scanner.nextLine());
            totalEatenGrams += eatenGrams;
            if (eatenGrams < 200) {
                smallCats++;
            } else if (eatenGrams < 300) {
                bigCats++;
            } else {
                omegaCats++;
            }
        }
        double priceFoodPerDay = (totalEatenGrams / 1000.0) * 12.45;

        System.out.printf("Group 1: %d cats.%n", smallCats);
        System.out.printf("Group 2: %d cats.%n", bigCats);
        System.out.printf("Group 3: %d cats.%n", omegaCats);
        System.out.printf("Price for food per day: %.2f lv.", priceFoodPerDay);
    }
}