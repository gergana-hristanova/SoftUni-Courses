package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class ReverseString_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String input = scanner.nextLine();

        String output = "";
        for (int i = input.length() -1 ; i >= 0; i--) {
            char lastLetter = input.charAt(i);
            output += lastLetter;
        }

        System.out.println(output);
    }
}
