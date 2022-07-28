package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class SumOfOddNumbers_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        int counter = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                counter++;
                sum += i;
            }
            if (counter == number) {
                break;
            }
        }

        System.out.printf("Sum: %d", sum);
    }
}