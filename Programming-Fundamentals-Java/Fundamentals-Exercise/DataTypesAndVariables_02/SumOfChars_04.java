package DataTypesAndVariables_02;

import java.util.Scanner;

public class SumOfChars_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        byte n = Byte.parseByte(scanner.nextLine());

        short sum = 0;
        for (int i = 1; i <= n; i++) {
          char currentChar = scanner.nextLine().charAt(0);
          sum += currentChar;
        }

        System.out.printf("The sum equals: %d", sum);
    }
}