package Arrays_03;

import java.util.Scanner;

public class DayOfWeek_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] daysOfWeek = new String[] {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };

        int inputNumber = Integer.parseInt(scanner.nextLine());
        if (inputNumber >= 1 && inputNumber <= 7) {
            System.out.print(daysOfWeek[inputNumber - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}