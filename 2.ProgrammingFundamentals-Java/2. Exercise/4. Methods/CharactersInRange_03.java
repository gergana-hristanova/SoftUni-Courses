package methods_04;

import java.util.Scanner;

public class CharactersInRange_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);

        System.out.println(getCharsInRange(firstChar, secondChar));
    }

    private static String getCharsInRange(char start, char end) {
        String output = "";
        if (start < end) {
            for (int i = start + 1; i < end; i++) {
                output += (char) i + " ";
            }
        } else {
            for (int i = end + 1; i < start; i++) {
                output += (char) i + " ";
            }
        }

        return output;
    }
}