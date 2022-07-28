package ExamPreparationMarch2022;

import java.util.Scanner;

public class EasterLunch_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int esterBreads = Integer.parseInt(scanner.nextLine());
        int eggCartons = Integer.parseInt(scanner.nextLine());
        int kgBiscuits = Integer.parseInt(scanner.nextLine());

        double easterBreadCost = esterBreads * 3.2;
        double eggCartonsCost = eggCartons * 4.35;
        double kgBiscuitsCost = kgBiscuits * 5.4;
        double eggPaintCost = eggCartons * 12 * 0.15;

        System.out.printf("%.2f", easterBreadCost + eggCartonsCost + kgBiscuitsCost + eggPaintCost);
    }
}