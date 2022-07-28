package textprocessing_08;

import java.util.Scanner;

public class ReverseStrings_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        while (!word.equals("end")) {

            String reversedWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord += word.charAt(i);
            }
            System.out.printf("%s = %s%n", word, reversedWord);

            word = scanner.nextLine();
        }
    }
}