package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int num = Integer.parseInt(scanner.nextLine());
        String numString = String.valueOf(num);

        int sum = 0;
        for (int i = 1; i <= numString.length(); i++) {
            int currentNum = num % 10;
            num = num / 10;
            int factorial = 1;
            for (int j = currentNum; j >= 1; j--) {
                factorial *= j;
            }
            sum += factorial;
        }

        num = Integer.parseInt(numString);
        if (num == sum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}