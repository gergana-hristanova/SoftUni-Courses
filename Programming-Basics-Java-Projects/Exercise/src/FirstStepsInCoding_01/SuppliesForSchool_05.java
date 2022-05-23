package FirstStepsInCoding_01;

import java.util.Scanner;

public class SuppliesForSchool_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int cleaners = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());

        double pensCost = pens * 5.80;
        double markersCost = markers * 7.20;
        double cleanersCost = cleaners * 1.20;

        double totalCost = pensCost + markersCost + cleanersCost;
        double finalCost = totalCost - (totalCost * (discount / 100));

        System.out.println(finalCost);
    }
}