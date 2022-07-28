package methods_04;

import java.util.Scanner;

public class Orders_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        costCalculator(product, quantity);
    }

    public static void costCalculator(String product, int quantity) {
        double costOfProduct = 0;
        switch(product) {
            case "coffee":
                costOfProduct = 1.50;
                break;
            case "water":
                costOfProduct = 1;
                break;
            case "coke":
                costOfProduct = 1.40;
                break;
            case "snacks":
                costOfProduct = 2;
                break;
        }

        System.out.printf("%.2f", costOfProduct * quantity);
    }
}