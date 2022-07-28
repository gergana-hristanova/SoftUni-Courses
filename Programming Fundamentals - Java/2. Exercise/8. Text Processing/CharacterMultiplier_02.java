package textprocessing_08;

import java.util.Scanner;

public class CharacterMultiplier_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.next();
        String secondString = scanner.next();

        int shorterLength = firstString.length();
        if (firstString.length() > secondString.length()) {
            shorterLength = secondString.length();
        }

        int sum = 0;
        for (int i = 0; i < shorterLength; i++) {
            char firstChar = firstString.charAt(i);
            char secondChar = secondString.charAt(i);

            sum += firstChar * secondChar;
        }

        if (shorterLength < firstString.length()) {
            for (int i = shorterLength; i < firstString.length(); i++) {
                sum += firstString.charAt(i);
            }

        } else if (shorterLength < secondString.length()) {
            for (int i = shorterLength; i < secondString.length(); i++) {
                sum += secondString.charAt(i);
            }
        }

        System.out.println(sum);
    }
}
