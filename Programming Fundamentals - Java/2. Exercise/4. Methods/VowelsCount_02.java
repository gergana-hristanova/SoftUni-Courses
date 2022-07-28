package methods_04;

import java.util.Scanner;

public class VowelsCount_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        printNumberOfVowels(input);
    }

    private static void printNumberOfVowels(String text) {
        byte vowelsCounter = 0;
        for (char currentLetter : text.toLowerCase().toCharArray()) {
            switch(currentLetter) {
                case 'a':
                case 'i':
                case 'e':
                case 'o':
                case 'u':
                    vowelsCounter++;
            }
        }

        System.out.println(vowelsCounter);
    }
}