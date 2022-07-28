package arrays_03;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        byte rotations = Byte.parseByte(scanner.nextLine());

        for (int i = 0; i < rotations; i++) {
            int firstDigit = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = firstDigit;
        }

        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}