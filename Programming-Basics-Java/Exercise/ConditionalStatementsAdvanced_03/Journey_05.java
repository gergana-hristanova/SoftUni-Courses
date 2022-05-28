package ConditionalStatementsAdvanced_03;

import java.util.Scanner;

public class Journey_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //въвеждаме данните
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        //дефинираме променливи за:
        String destination = ""; //дестинацията
        String accommodation = ""; //акомодацията (хотел/къмпинг)
        double cost = 0; //цената
        //проверяваме стойността на бюджета
        if (budget <= 100) {
            destination = "Bulgaria";
            //проверяваме сезона
            if (season.equals("summer")) {
                cost = budget * 0.3;
                accommodation = "Camp";
            } else {
                cost = budget * 0.7;
                accommodation = "Hotel";
            }
        }
        else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                cost = budget * 0.4;
                accommodation = "Camp";
            } else {
                cost = budget * 0.8;
                accommodation = "Hotel";
            }
        }
        else {
            //за Европа не проверяваме сезона
            cost = budget * 0.9;
            destination = "Europe";
            accommodation = "Hotel";
        }
        //извеждаме резултатите
        System.out.printf("Somewhere in %s\n" +
                "%s - %.2f", destination, accommodation, cost);
    }
}