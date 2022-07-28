package PreExamApril2022;

import java.util.Scanner;

public class Everest_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalClimbedMeters = 5364;
        int days = 1;
        boolean peakReached = false;

        label:
        while (days <= 5) {
            if (totalClimbedMeters >= 8848) {
                peakReached = true;
                break;
            }
            String overnight = scanner.nextLine();
            switch (overnight) {
                case "END":
                    break label;
                case "Yes": {
                    days++;
                    break;
                }
                case "No": {
                    break;
                }
            }
            if (days > 5) {
                break;
            }
            int climbedMeters = Integer.parseInt(scanner.nextLine());
            totalClimbedMeters += climbedMeters;
        }

        if (peakReached) {
            System.out.printf("Goal reached for %d days!", days);
        } else {
            System.out.printf("Failed!%n" +
                    "%d", totalClimbedMeters);
        }
    }
}