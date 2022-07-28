package arrays_03;

import java.util.Arrays;
import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        byte n = Byte.parseByte(scanner.nextLine());

        int[] array = new int[n];
        for (byte i = 0; i < n; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            array[i] = input;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.stream(array).sum());
    }
}