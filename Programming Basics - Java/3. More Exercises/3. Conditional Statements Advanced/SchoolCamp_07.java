package ConditionalStatementsAdvanced_03;

import java.util.Scanner;

public class SchoolCamp_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //въвеждаме данните
        String season = scanner.nextLine();
        String groupType = scanner.nextLine();
        int studentsAmount = Integer.parseInt(scanner.nextLine());
        int nightsAmount = Integer.parseInt(scanner.nextLine());
        //дефинираме променливи за:
        double nightCost = 0; //цената на нощувка
        String sport = ""; //спорта
        //проверяваме сезона
        switch (season) {
            case "Winter":
                //проверяваме вида на групата
                switch (groupType) {
                    case "girls":
                        nightCost = 9.60;
                        sport = "Gymnastics";
                        break;
                    case "boys":
                        sport = "Judo";
                        nightCost = 9.60;
                        break;
                    case "mixed":
                        sport = "Ski";
                        nightCost = 10;
                        break;
                }
                break;
            case "Spring":
                switch (groupType) {
                    case "girls":
                        nightCost = 7.20;
                        sport = "Athletics";
                        break;

                    case "boys":
                        sport = "Tennis";
                        nightCost = 7.20;
                        break;
                    case "mixed":
                        sport = "Cycling";
                        nightCost = 9.50;
                        break;
                }
                break;
            case "Summer":
                switch (groupType) {
                    case "girls":
                        nightCost = 15;
                        sport = "Volleyball";
                        break;

                    case "boys":
                        sport = "Football";
                        nightCost = 15;
                        break;
                    case "mixed":
                        sport = "Swimming";
                        nightCost = 20;
                        break;
                }
                break;
        }
        //пресмятаме цялата цена
        double totalCost = nightCost * nightsAmount * studentsAmount;
        //проверяваме за отстъпки
        if (studentsAmount >= 10 && studentsAmount < 20) {
            totalCost -= totalCost * 0.05;
        } else if (studentsAmount >= 20 && studentsAmount < 50) {
            totalCost -= totalCost * 0.15;
        } else if (studentsAmount >= 50) {
            totalCost -= totalCost * 0.50;
        }
        //извеждаме резултата
        System.out.printf("%s %.2f lv.", sport, totalCost);
    }
}