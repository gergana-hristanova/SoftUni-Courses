package methods_04;

import java.util.Scanner;

public class MiddleCharacters_06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        printMiddleCharacter(input);
    }

    private static void printMiddleCharacter(String text) {
        if (text.length() % 2 != 0) {
            char middleCharacter = text.charAt(text.length() / 2);
            System.out.println(middleCharacter);
        } else {
            char firstMidChar = text.charAt(text.length() / 2 - 1);
            char secondMidChar = text.charAt(text.length() / 2);
            System.out.print(firstMidChar);
            System.out.print(secondMidChar);
        }
    }
}