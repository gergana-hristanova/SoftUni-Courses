package ConditionalStatementsAdvanced_03;

import java.util.Scanner;

public class OnTimeForTheExam_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //въвеждаме данните
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMins = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMins = Integer.parseInt(scanner.nextLine());
        //изчисляваме времето на изпита и времето на пристигане в минути
        int examTime = examHour * 60 + examMins;
        int arrivalTime = arrivalHour * 60 + arrivalMins;
        //изчисляваме разликата между времето на изпита и времето на пристигане
        int diff = Math.abs(examTime - arrivalTime);
        //проверяваме дали времето на пристигане е по-голямо (по-късно) от времето на изпита
        if (arrivalTime > examTime) {
            System.out.println("Late");
            if (diff >= 60) {
                System.out.printf("%d:%02d hours after the start", diff / 60, diff % 60);
            } else {
                System.out.printf("%d minutes after the start", diff);
            }
        } else if (diff <= 30) {
            System.out.println("On time");
            if (examTime != arrivalTime) {
                System.out.printf("%d minutes before the start", diff);
            }
        } else if (arrivalTime < examTime + 30) {
            System.out.println("Early");
            if (diff >= 60) {
                System.out.printf("%d:%02d hours before the start", diff / 60, diff % 60);
            } else {
                System.out.printf("%d minutes before the start", diff);
            }
        }
    }
}