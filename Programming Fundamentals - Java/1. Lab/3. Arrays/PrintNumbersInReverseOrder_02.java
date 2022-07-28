package Arrays_03;

import java.util.Scanner;

public class PrintNumbersInReverseOrder_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        short[] numbersArray = new short[n];
        for (int i = 0; i < n; i++) {
            numbersArray[i] = Short.parseShort(scanner.nextLine());
        }
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(numbersArray[i] + " ");
        }
    }
}