package methods_04;

import java.util.Scanner;

public class Calculations_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actionInput = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        switch(actionInput) {
            case "add":
                printAddNumbers(firstNumber, secondNumber);
                break;
            case "multiply":
                printMultiplyNumbers(firstNumber, secondNumber);
                break;
            case "subtract":
                printSubtractNumbers(firstNumber, secondNumber);
                break;
            case "divide":
                printDivideNumbers(firstNumber, secondNumber);
                break;
        }
    }

    public static void printAddNumbers(int firstAddend, int secondAddend) {
        int sum = firstAddend + secondAddend;
        System.out.println(sum);
    }

    public static void printMultiplyNumbers(int firstFactor, int secondFactor) {
        int product = firstFactor * secondFactor;
        System.out.println(product);
    }

    public static void printSubtractNumbers(int minuend, int subtrahend) {
        int difference = minuend - subtrahend;
        System.out.println(difference);
    }

    public static void printDivideNumbers(int dividend, int divisor) {
        int quotient = dividend / divisor;
        System.out.println(quotient);
    }
}