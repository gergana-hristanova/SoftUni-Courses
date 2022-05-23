package FirstStepsInCoding_01;

import java.util.Scanner;

public class Repainting_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double nylonCost = (nylon + 2) * 1.5;
        double paintCost = (paint + (paint * 0.1)) * 14.5;
        double thinnerCost = thinner * 5;
        double materialCost = nylonCost + paintCost + thinnerCost + 0.4;

        double workersCost = (materialCost * 0.3) * hours;
        double totalCost = materialCost + workersCost;

        System.out.println(totalCost);
    }
}