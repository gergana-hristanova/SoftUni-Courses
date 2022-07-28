package ConditionalStatementsAdvanced_03;

import java.util.Scanner;

public class SkiTrip_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //въвеждаме данните
        int days = Integer.parseInt(scanner.nextLine());
        String accommodation = scanner.nextLine();
        String rating = scanner.nextLine();
        //дефинираме променливи за:
        int overnights = days - 1; //нощувките
        double overnightCost = 0; //цената за една нощувка
        double totalCost = 0; //крайната цена
        //проверяваме вида на помещението
        switch (accommodation) {
            case "room for one person":
                overnightCost = 18;
                //изчисляваме крайната цена
                totalCost = overnightCost * overnights;
                break;
            case "apartment":
                overnightCost = 25;
                totalCost = overnightCost * overnights;
                //проверяваме за отстъпки
                if (days < 10) {
                    totalCost -= totalCost * 0.30;
                } else if (days <= 15) {
                    totalCost -= totalCost * 0.35;
                } else {
                    totalCost -= totalCost * 0.50;
                }
                break;
            case "president apartment":
                overnightCost = 35;
                totalCost = overnightCost * overnights;
                if (days < 10) {
                    totalCost -= totalCost * 0.10;
                } else if (days <= 15) {
                    totalCost -= totalCost * 0.15;
                } else {
                    totalCost -= totalCost * 0.20;
                }
                break;
        }
        //проверяваме оценката
        if (rating.equals("positive")) {
            totalCost += totalCost * 0.25;
        } else {
            totalCost -= totalCost * 0.10;
        }
        //извеждаме резултата
        System.out.printf("%.2f", totalCost);
    }
}