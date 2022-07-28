package midexampreparation;

import java.util.Scanner;

public class SoftUniReception_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int efficiency =  Integer.parseInt(scanner.nextLine())
                        + Integer.parseInt(scanner.nextLine())
                        + Integer.parseInt(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());

        int hoursCounter = 0;
        while (studentsCount > 0) {
            hoursCounter++;
            if (hoursCounter % 4 == 0) {
                continue;
            }

            studentsCount -= efficiency;
        }

        System.out.printf("Time needed: %dh.", hoursCounter);
    }
}