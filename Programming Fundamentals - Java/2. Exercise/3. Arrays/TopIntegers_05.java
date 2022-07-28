package arrays_03;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < array.length; i++) {
            boolean isTop = true;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] <= array[j]) {
                    isTop = false;
                }
                if (isTop && j == array.length - 1) {
                    System.out.print(array[i] + " ");
                }
            }
        }
        System.out.println(array[array.length - 1]);
    }
}