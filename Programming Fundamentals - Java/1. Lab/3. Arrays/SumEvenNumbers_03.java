package Arrays_03;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] stringsArray = input.split(" ");
        int[] integersArray = new int[stringsArray.length];
        int sum = 0;

        for (int i = 0; i < stringsArray.length; i++) {
            integersArray[i] = Integer.parseInt(stringsArray[i]);
            if (integersArray[i] % 2 == 0) {
                sum += integersArray[i];
            }
        }

        System.out.println(sum);
    }
}