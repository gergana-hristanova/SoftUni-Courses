package methods_04;

import java.util.Scanner;

public class SmallestOfThreeNumbers_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int firstNumberInput = Integer.parseInt(scanner.nextLine());
        int secondNumberInput = Integer.parseInt(scanner.nextLine());
        int thirdNumberInput = Integer.parseInt(scanner.nextLine());

        printSmallestNumber(firstNumberInput, secondNumberInput, thirdNumberInput);
    }

    private static void printSmallestNumber(int first, int second, int third) {
        int smallestNumber = 0;
        if (first <= second && first <= third) {
            smallestNumber = first;
        } else if (second <= first && second <= third){
            smallestNumber = second;
        } else {
            smallestNumber = third;
        }
        System.out.println(smallestNumber);
    }
}