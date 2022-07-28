package FinalExamApril2022;

import java.util.Scanner;

public class GoldMine_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int locationsAmount = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= locationsAmount; i++) {
            double expectedGoldPerDay = Double.parseDouble(scanner.nextLine());
            double gainedGold = 0;

            int days = Integer.parseInt(scanner.nextLine());
            for (int j = 1; j <= days; j++) {
                double dailyGold = Double.parseDouble(scanner.nextLine());
                gainedGold += dailyGold;
            }
            double averageGoldPerDay = gainedGold / days;
            if (expectedGoldPerDay <= averageGoldPerDay) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", averageGoldPerDay);
            } else {
                System.out.printf("You need %.2f gold.%n", expectedGoldPerDay - averageGoldPerDay);
            }
        }
    }
}