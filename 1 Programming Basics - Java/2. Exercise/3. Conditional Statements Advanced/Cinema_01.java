package ConditionalStatementsAdvanced_03;

import java.util.Scanner;

public class Cinema_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        int totalSeats = rows * columns;
        double income = 0;

        switch (projection) {
            case "Premiere":
                income = totalSeats * 12;
                break;
            case "Normal":
                income = totalSeats * 7.5;
                break;
            case "Discount":
                income = totalSeats * 5;
                break;
        }

        System.out.printf("%.2f leva", income);
    }
}