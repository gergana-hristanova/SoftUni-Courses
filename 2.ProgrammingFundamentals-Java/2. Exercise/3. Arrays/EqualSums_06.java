package arrays_03;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean satisfyingIndexExists = false;
        int satisfyingIndex = 0;
        for (int i = 0; i < array.length; i++) {
            int sumOfIntsBefore = 0;
            int sumOfIntsAfter = 0;
            for (int j = 0; j < i; j++) {
                sumOfIntsBefore += array[j];
            }
            for (int j = i + 1; j < array.length; j++) {
                sumOfIntsAfter += array[j];
            }
            if (sumOfIntsBefore == sumOfIntsAfter) {
                satisfyingIndexExists = true;
                satisfyingIndex = i;
            }
        }

        if (satisfyingIndexExists) {
            System.out.println(satisfyingIndex);
        } else {
            System.out.println("no");
        }
    }
}