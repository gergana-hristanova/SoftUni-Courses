package FirstStepsInCoding_01;

import java.util.Scanner;

public class VegetableMarket_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double veggiesCostPerKilo = Double.parseDouble(scanner.nextLine());
        double fruitsCostPerKilo = Double.parseDouble(scanner.nextLine());
        int veggies = Integer.parseInt(scanner.nextLine());
        int fruits = Integer.parseInt(scanner.nextLine());

        double veggiesTotalCost = veggiesCostPerKilo * veggies;
        double fruitsTotalCost = fruitsCostPerKilo * fruits;
        double totalCostLev = veggiesTotalCost + fruitsTotalCost;
        double totalCostEuro = totalCostLev / 1.94;

        System.out.printf("%.2f", totalCostEuro);
    }
}