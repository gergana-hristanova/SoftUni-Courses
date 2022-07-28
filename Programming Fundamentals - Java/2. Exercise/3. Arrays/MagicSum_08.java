package arrays_03;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int magicSum = Integer.parseInt(scanner.nextLine());

        for (int index1 = 0; index1 < array.length; index1++) {
            for (int index2 = index1 + 1; index2 < array.length; index2++) {
                    if (array[index1] + array[index2] == magicSum) {
                        System.out.println(array[index1] + " " + array[index2]);
                    }

            }
        }
    }
}