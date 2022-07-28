package Arrays_03;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] strings = input.split(" ");

        int[] integers = new int[strings.length];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = Integer.parseInt(strings[i]);
        }

        if (integers.length == 1) {
            System.out.println(integers[0]);
        } else {
            int[] condensed = new int[integers.length - 1];
            for (int i = 0; i < integers.length; i++) {
                for (int j = 0; j < integers.length - 1; j++) {
                    condensed[j] = integers[j] + integers[j + 1];
                }
                integers = condensed;
            }

            System.out.println(condensed[0]);
        }
    }
}