package ConditionalStatementsAdvanced_03;

import java.util.Scanner;

public class TruckDriver_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //въвеждаме данните
        String season = scanner.nextLine();
        double kmPerMonth = Double.parseDouble(scanner.nextLine());
        //дефинираме променлива за сумата на километър
        double incomePerKm = 0;
        //проверяваме сезона
        switch (season) {
            case "Spring":
            case "Autumn":
                //проверяваме сумата километри на месец
                if (kmPerMonth <= 5000) {
                    incomePerKm = 0.75;
                } else if (kmPerMonth <= 10000) {
                    incomePerKm = 0.95;
                } else if (kmPerMonth <= 20000) {
                    incomePerKm = 1.45;
                }
                break;
            case "Summer":
                if (kmPerMonth <= 5000) {
                    incomePerKm = 0.90;
                } else if (kmPerMonth <= 10000) {
                    incomePerKm = 1.10;
                } else if (kmPerMonth <= 20000) {
                    incomePerKm = 1.45;
                }
                break;
            case "Winter":
                if (kmPerMonth <= 5000) {
                    incomePerKm = 1.05;
                } else if (kmPerMonth <= 10000) {
                    incomePerKm = 1.25;
                } else if (kmPerMonth <= 20000) {
                    incomePerKm = 1.45;
                }
                break;
        }
        //изчисляваме общата сума
        double totalIncome = kmPerMonth * 4 * incomePerKm;
        totalIncome -= totalIncome * 0.10;
        //извеждаме резултата
        System.out.printf("%.2f", totalIncome);
    }
}