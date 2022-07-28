package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String input = scanner.nextLine();

        double sum = 0;
        while(!input.equals("Start")) {
            double inputDouble = Double.parseDouble(input);

            if (inputDouble != 0.1) {
                if (inputDouble != 0.2) {
                    if (inputDouble != 0.5) {
                        if (inputDouble != 1) {
                            if (inputDouble != 2) {
                                System.out.printf("Cannot accept %.2f%n", inputDouble);
                                input = scanner.nextLine();
                                continue;
                            }
                        }
                    }
                }
            }

            sum += inputDouble;
            input = scanner.nextLine();
        }

        String product = scanner.nextLine();

        while(!product.equals("End")) {
            switch (product) {
                case "Nuts":
                    if (sum < 2) {
                        System.out.println("Sorry, not enough money");
                        product = scanner.nextLine();
                        continue;
                    } else {
                        sum -= 2;
                        System.out.println("Purchased Nuts");
                    }
                    break;
                case "Water":
                    if (sum < 0.7) {
                        System.out.println("Sorry, not enough money");
                        product = scanner.nextLine();
                        continue;
                    } else {
                        sum -= 0.7;
                        System.out.println("Purchased Water");
                    }
                    break;
                case "Crisps":
                    if (sum < 1.5) {
                        System.out.println("Sorry, not enough money");
                        product = scanner.nextLine();
                        continue;
                    } else {
                        sum -= 1.5;
                        System.out.println("Purchased Crisps");
                    }
                    break;
                case "Soda":
                    if (sum < 0.8) {
                        System.out.println("Sorry, not enough money");
                        product = scanner.nextLine();
                        continue;
                    } else {
                        sum -= 0.8;
                        System.out.println("Purchased Soda");
                    }
                    break;
                case "Coke":
                    if (sum < 1) {
                        System.out.println("Sorry, not enough money");
                        product = scanner.nextLine();
                        continue;
                    } else {
                        sum -= 1;
                        System.out.println("Purchased Coke");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
            }
            product = scanner.nextLine();
        }

        System.out.printf("Change: %.2f", sum);
    }
}