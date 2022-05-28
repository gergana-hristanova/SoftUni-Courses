package ConditionalStatementsAdvanced_03;

import java.util.Scanner;

public class Vacation_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //въвеждаме данните
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        //дефинираме променливи за:
        String location = ""; //локацията
        String accommodation = ""; //мястото на настаняване
        double cost = 0; //цената
        //проверяваме стойността на бюджета
        if (budget <= 1000) {
            accommodation = "Camp";
            //проверяваме сезона
            if (season.equals("Summer")) {
                location = "Alaska";
                cost = budget * 0.65;
            } else {
                location = "Morocco";
                cost = budget * 0.45;
            }
        } else if (budget <= 3000) {
            accommodation = "Hut";
            if (season.equals("Summer")) {
                location = "Alaska";
                cost = budget * 0.80;
            } else {
                location = "Morocco";
                cost = budget * 0.60;
            }
        } else {
            accommodation = "Hotel";
            cost = budget * 0.90;
            if (season.equals("Summer")) {
                location = "Alaska";
            } else {
                location = "Morocco";
            }
        }
        //извеждаме резултата
        System.out.printf("%s - %s - %.2f",
                location, accommodation, cost);
    }
}