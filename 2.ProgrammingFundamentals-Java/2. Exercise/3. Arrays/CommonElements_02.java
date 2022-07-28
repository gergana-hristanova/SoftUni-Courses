package arrays_03;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Object[] firstArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .toArray();
        Object[] secondArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .toArray();

        for (int i = 0; i < secondArray.length; i++) {
            for (int j = 0; j < firstArray.length; j++) {
                if (secondArray[i].equals(firstArray[j])) {
                    System.out.print(firstArray[j] + " ");
                }
            }
        }
    }
}