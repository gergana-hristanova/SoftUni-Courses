package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class MultiplicationTable2_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        if (num2 < 10) {
            for (int i = num2; i <= 10; i++) {
                System.out.printf("%d X %d = %d%n",
                        num1, i, num1 * i);
            }
        } else {
            System.out.printf("%d X %d = %d", num1, num2, num1 * num2);
        }
    }
}