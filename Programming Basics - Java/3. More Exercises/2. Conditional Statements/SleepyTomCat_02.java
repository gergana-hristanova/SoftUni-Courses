package ConditionalStatements_02;

import java.util.Scanner;

public class SleepyTomCat_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //въвеждаме почивните дни
        int holidays = Integer.parseInt(scanner.nextLine());
        //намираме работните дни
        int workdays = 365 - holidays;

        //изчисляваме времето за игра през:
        int playTimeHolidays = holidays * 127; //почивните дни
        int playTimeWorkdays = workdays * 63; //работните дни
        int playTimePerYear = playTimeHolidays + playTimeWorkdays; //цялата година

        //изчисляваме разликата между нормата и времето за игра през цялата година
        double diff = Math.abs(30000 - playTimePerYear);

        //проверяваме дали времето за игра през годината надвишава нормата
        if (playTimePerYear > 30000) {
            //изписваме резултатите
            System.out.println("Tom will run away");
            System.out.printf("%.0f hours and %.0f minutes more for play",
                    Math.floor(diff / 60), Math.floor(diff % 60));
        } else {
            System.out.println("Tom sleeps well");
            System.out.printf("%.0f hours and %.0f minutes less for play",
                    Math.floor(diff / 60), Math.floor(diff % 60));
        }
    }
}