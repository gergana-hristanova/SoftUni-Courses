package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class GamingStore_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double budgetPlaceholder = budget;

        String input = scanner.nextLine();
        boolean outOfMoney = false;
        while (!input.equals("Game Time")) {
            double price = 0;
            switch(input) {
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    break;
                case "CS: OG":
                    price = 15.99;
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    break;
                case "Honored 2":
                    price = 59.99;
                    break;
                case "RoverWatch":
                    price = 29.99;
            }

            if (price == 0) {
                System.out.println("Not Found");
            } else if (budget >= price) {
                budget -= price;
                System.out.printf("Bought %s%n", input);
            } else {
                System.out.println("Too Expensive");
            }
            if (budget == 0) {
                System.out.println("Out of money!");
                outOfMoney = true;
                break;
            }
            input = scanner.nextLine();
        }

        if (!outOfMoney) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", budgetPlaceholder - budget, budget);
        }
    }
}