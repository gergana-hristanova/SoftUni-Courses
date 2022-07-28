package arrays_03;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        byte overallEqualsCounter = 1;
        byte overallRepeatingDigit = 0;
        byte equalsCounter = 1;
        byte repeatingDigit = 0;
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] == array[i - 1]) {
                equalsCounter++;
                repeatingDigit = (byte) array[i];
            } else if (array[i] < array.length - 1) {
                equalsCounter = 1;
                repeatingDigit = 0;
            }

            if (equalsCounter >= overallEqualsCounter) {
                overallEqualsCounter = equalsCounter;
                overallRepeatingDigit = repeatingDigit;
            }
        }

        for (int i = 1; i <= overallEqualsCounter; i++) {
            System.out.print(overallRepeatingDigit + " ");
        }
    }
}