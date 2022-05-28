package ForLoop_04;

import java.util.Scanner;

public class GameOfIntervals_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double turns = Integer.parseInt(scanner.nextLine());
        double totalPoints = 0;
        //следвашите променливи за броячи
        int from0to9 = 0;
        int from10to19 = 0;
        int from20to29 = 0;
        int from30to39 = 0;
        int from40to50 = 0;
        int invalid = 0;

        for (int i = 1; i <= turns; i++) {
            double points = Integer.parseInt(scanner.nextLine());

            if (points < 0 || points > 50) {
                totalPoints /= 2;
                invalid++;
                continue;
            } else if (points < 10) {
                points *= 0.2;
                from0to9++;
            } else if (points < 20) {
                points *= 0.3;
                from10to19++;
            } else if (points < 30) {
                points *= 0.4;
                from20to29++;
            } else if (points < 40) {
                points = 50;
                from30to39++;
            } else {
                points = 100;
                from40to50++;
            }
            totalPoints += points;
        }
        //пресмятаме и извеждаме резултатите
        System.out.printf("%.2f%n", totalPoints);
        System.out.printf("From 0 to 9: %.2f%%%n", from0to9 / turns * 100);
        System.out.printf("From 10 to 19: %.2f%%%n", from10to19 / turns * 100);
        System.out.printf("From 20 to 29: %.2f%%%n", from20to29 / turns * 100);
        System.out.printf("From 30 to 39: %.2f%%%n", from30to39 / turns * 100);
        System.out.printf("From 40 to 50: %.2f%%%n", from40to50 / turns * 100);
        System.out.printf("Invalid numbers: %.2f%%%n", invalid / turns * 100);
    }
}