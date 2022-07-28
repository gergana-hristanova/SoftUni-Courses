package arrays_03;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        byte n = Byte.parseByte(scanner.nextLine());

        int[] firstArray = new int[n];
        int[] secondArray = new int[n];
        for (int i = 0; i < n; i++) {

            int[] inputArray = Arrays
                    .stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            if (i % 2 == 0) {
                firstArray[i] = inputArray[0];
                secondArray[i] = inputArray[1];
            } else {
                secondArray[i] = inputArray[0];
                firstArray[i] = inputArray[1];
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(firstArray[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(secondArray[i] + " ");
        }
    }
}