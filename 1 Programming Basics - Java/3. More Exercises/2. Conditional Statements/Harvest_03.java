package ConditionalStatements_02;

import java.util.Scanner;

public class Harvest_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int vineyardSize = Integer.parseInt(scanner.nextLine());
        double grapesPerSqMeter = Double.parseDouble(scanner.nextLine());
        int neededWine = Integer.parseInt(scanner.nextLine());
        int workersAmount = Integer.parseInt(scanner.nextLine());

        double totalGrapes = vineyardSize * 0.4 * grapesPerSqMeter;
        double producedWine = totalGrapes / 2.5;
        double diff = Math.abs(neededWine - producedWine);

        if (producedWine < neededWine) {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.",
                    Math.floor(diff));
        } else {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n",
                    Math.floor(producedWine));
            double wineForWorkers = (diff / workersAmount);
            System.out.printf("%.0f liters left -> %.0f liters per person.",
                    Math.ceil(diff), Math.ceil(wineForWorkers));
        }
    }
}