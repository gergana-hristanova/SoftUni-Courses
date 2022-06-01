package Arrays_03;

import java.util.Scanner;

public class EqualArrays_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstInput = scanner.nextLine();
        String[] firstArrayString = firstInput.split(" ");

        int sum = 0;
        int[] firstArrayInt = new int[firstArrayString.length];
        for (byte i = 0; i < firstArrayString.length; i++) {
            firstArrayInt[i] = Integer.parseInt(firstArrayString[i]);
            sum += firstArrayInt[i];
        }

        String secondInput = scanner.nextLine();
        String[] secondArrayString = secondInput.split(" ");

        int[] secondArrayInt = new int[secondArrayString.length];
        for (byte i = 0; i < secondArrayString.length; i++) {
            secondArrayInt[i] = Integer.parseInt(secondArrayString[i]);
        }

        byte identicalChecker = 0;
        for (byte i = 0; i < firstArrayInt.length; i++) {
            if (!(firstArrayInt[i] == secondArrayInt[i])) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                break;
            } else {
                identicalChecker++;
            }
        }

        if (identicalChecker == firstArrayInt.length) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}