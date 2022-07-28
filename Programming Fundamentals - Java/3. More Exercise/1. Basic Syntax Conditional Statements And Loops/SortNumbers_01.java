package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class SortNumbers_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        if (num1 <= num2 && num2 <= num3) {
            System.out.printf("%d%n%d%n%d%n", num3, num2, num1);
        } else if (num1 <= num3 && num3 <= num2) {
            System.out.printf("%d%n%d%n%d%n", num2, num3, num1);
        } else if (num2 <= num1 && num1 <= num3) {
            System.out.printf("%d%n%d%n%d%n", num3, num1, num2);
        } else if (num2 <= num3) {
            System.out.printf("%d%n%d%n%d%n", num1, num3, num2);
        } else if (num1 <= num2) {
            System.out.printf("%d%n%d%n%d%n", num2, num1, num3);
        } else {
            System.out.printf("%d%n%d%n%d%n", num1, num2, num3);
        }
    }
}