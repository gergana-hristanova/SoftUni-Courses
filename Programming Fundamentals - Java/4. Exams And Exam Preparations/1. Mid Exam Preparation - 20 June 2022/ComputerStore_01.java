package midexampreparation;

import java.util.Scanner;

public class ComputerStore_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double totalNoTaxes = 0;
        while (!input.equals("special") && !input.equals("regular")) {
            double currentPartPrice = Double.parseDouble(input);

            if (currentPartPrice <= 0) {
                System.out.println("Invalid price!");
            } else {
                totalNoTaxes += currentPartPrice;
            }

            input = scanner.nextLine();
        }

        double taxes = totalNoTaxes * 0.2;
        double totalWithTaxes = totalNoTaxes + taxes;

        if (totalWithTaxes == 0) {
            System.out.println("Invalid order!");
        } else {

            if (input.equals("special")) {
                totalWithTaxes -= totalWithTaxes * 0.1;
            }

            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", totalNoTaxes);
            System.out.printf("Taxes: %.2f$%n", taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", totalWithTaxes);
        }
    }
}