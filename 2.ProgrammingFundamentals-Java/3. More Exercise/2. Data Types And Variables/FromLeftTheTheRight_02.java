package DataTypesAndVariables_02;

import java.util.Arrays;
import java.util.Scanner;

public class FromLeftTheTheRight_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Byte.parseByte(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            long[] array = Arrays
                    .stream(scanner.nextLine().split(" "))
                    .mapToLong(Long::parseLong)
                    .toArray();

            int sum = 0;
            if (array[0] > array[1]) {
                while (array[0] != 0) {
                    sum += array[0] % 10;
                    array[0] /= 10;
                }
            } else {
                while (array[1] != 0) {
                    sum += array[1] % 10;
                    array[1] /= 10;
                }
            }
            String sumString = String.valueOf(sum).replace("-", "");
            System.out.println(sumString);
        }
    }
}