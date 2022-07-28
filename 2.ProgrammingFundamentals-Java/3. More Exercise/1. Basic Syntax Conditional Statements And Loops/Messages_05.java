package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class Messages_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String number = scanner.nextLine();
            int mainDigit = Character.getNumericValue(number.charAt(0));
            int offset = (mainDigit - 2) * 3;
            if (mainDigit == 8 || mainDigit == 9) {
                offset++;
            }
            int code = 97 + (offset + number.length() - 1);
            if(code == 91) {
                System.out.print(" ");
            } else {
                char letter = (char) code;
                System.out.print(letter);
            }
        }
    }
}