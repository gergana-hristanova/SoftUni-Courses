package DataTypesAndVariables_02;

import java.util.Scanner;

public class DataTypeFinder_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("END")) {
            boolean dataIsInt = true;
            try {
                int inputInt = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                dataIsInt = false;
            }

            boolean dataIsFloat = true;
            try {
                double inputFloat = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                dataIsFloat = false;
            }

            if (dataIsInt) {
                System.out.printf("%s is integer type%n", input);
            } else if (dataIsFloat) {
                System.out.printf("%s is floating point type%n", input);
            } else if (input.length() == 1) {
                System.out.printf("%s is character type%n", input);
            } else if (input.equalsIgnoreCase("true") || (input.equalsIgnoreCase("false"))) {
                System.out.printf("%s is boolean type%n", input);
            } else {
                System.out.printf("%s is string type%n", input);
            }

            input = scanner.nextLine();
        }
    }
}