package ConditionalStatements_02;

import java.util.Scanner;

public class EvenOrOdd_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        /*if (number % 2 == 0) {
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }*/

        boolean isEven = number % 5 == 0;

        if (isEven) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}