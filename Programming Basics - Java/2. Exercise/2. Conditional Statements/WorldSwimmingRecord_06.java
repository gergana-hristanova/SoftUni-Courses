package ConditionalStatements_02;

import java.util.Scanner;

public class WorldSwimmingRecord_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //въвеждаме данните
        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timePerMeter = Double.parseDouble(scanner.nextLine());

        //изчисляваме времето
        double totalTime = distance * timePerMeter;
        //изчисляваме закъснението
        double delay = Math.floor(distance / 15) * 12.5;
        //изчисляваме крайното време
        double finalTime = totalTime + delay;

        //проверяваме дали рекордът е подобрен
        if (finalTime < record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", finalTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", finalTime - record);
        }
    }
}