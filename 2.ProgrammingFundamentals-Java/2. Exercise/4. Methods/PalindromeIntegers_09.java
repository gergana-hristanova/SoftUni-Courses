package methods_04;

import java.util.Scanner;

public class PalindromeIntegers_09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while(!input.equals("END")) {
            int numberInput = Integer.parseInt(input);
            System.out.println(palindromeChecker(numberInput));

            input = scanner.nextLine();
        }
    }

    public static boolean palindromeChecker(int number) {
        String numberToString = String.valueOf(number);
        String reversedNumber = "";
        for (int i = numberToString.length() - 1; i >= 0; i--) {
            reversedNumber += numberToString.charAt(i);
        }

        return numberToString.equals(reversedNumber);
    }
}