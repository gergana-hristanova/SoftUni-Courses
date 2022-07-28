package FirstStepsInCoding_01;

import java.util.Scanner;

public class VacationBooksList_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int hours = pages / pagesPerHour;
        int hoursPerDay = hours / days;

        System.out.println(hoursPerDay);
    }
}