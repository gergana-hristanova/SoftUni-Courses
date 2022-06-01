package Arrays_03;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sumOfEvenNumbers = 0;
        int sumOfOddNumbers = 0;

        int[] numbersArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int item : numbersArray) {
            if (item % 2 == 0) {
                sumOfEvenNumbers += item;
            } else {
                sumOfOddNumbers += item;
            }
        }

        System.out.println(sumOfEvenNumbers - sumOfOddNumbers);
    }
}