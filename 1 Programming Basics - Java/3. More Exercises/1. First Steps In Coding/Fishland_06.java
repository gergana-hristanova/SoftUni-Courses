package FirstStepsInCoding_01;

import java.util.Scanner;

public class Fishland_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //всички наименования на рибите са на английски
        double mackerelPrice = Double.parseDouble(scanner.nextLine());
        double toyPrice = Double.parseDouble(scanner.nextLine());
        double bonitoKilos = Double.parseDouble(scanner.nextLine());
        double horseMackerelKilos = Double.parseDouble(scanner.nextLine());
        double musselsKilos = Double.parseDouble(scanner.nextLine());

        double bonitoCost = (mackerelPrice + (mackerelPrice * 0.6)) * bonitoKilos;
        double horseMackerelCost = (toyPrice + (toyPrice * 0.8)) * horseMackerelKilos;
        double musselsCost = musselsKilos * 7.5;

        double totalCost = bonitoCost + horseMackerelCost + musselsCost;

        System.out.printf("%.2f", totalCost);
    }
}