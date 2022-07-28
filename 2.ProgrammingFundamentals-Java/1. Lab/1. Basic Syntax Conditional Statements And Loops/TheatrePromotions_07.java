package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class TheatrePromotions_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String dayType = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        if (0 <= age && age <= 18) {
            switch (dayType) {
                case "Weekday":
                    System.out.println("12$");
                    break;
                case "Weekend":
                    System.out.println("15$");
                    break;
                case "Holiday":
                    System.out.println("5$");
            }
        } else if (18 < age && age <= 64) {
            switch (dayType) {
                case "Weekday":
                    System.out.println("18$");
                    break;
                case "Weekend":
                    System.out.println("20$");
                    break;
                case "Holiday":
                    System.out.println("12$");
            }
        } else if (64 < age && age <= 122) {
            switch (dayType) {
                case "Weekday":
                    System.out.println("12$");
                    break;
                case "Weekend":
                    System.out.println("15$");
                    break;
                case "Holiday":
                    System.out.println("10$");
            }
        } else {
            System.out.println("Error!");
        }
    }
}