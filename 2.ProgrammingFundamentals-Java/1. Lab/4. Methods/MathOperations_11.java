package methods_04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations_11 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       double firstNumberInput = Integer.parseInt(scanner.nextLine());
       char operatorInput = scanner.nextLine().charAt(0);
       double secondNumberInput = Integer.parseInt(scanner.nextLine());

        System.out.println(new DecimalFormat("0.####")
                .format(calculate(firstNumberInput, operatorInput, secondNumberInput)));
    }

    public static double calculate(double first, char operator, double second) {
        double result = 0;
        switch(operator) {
            case '/':
               result = first / second;
               break;
            case '*':
                result = first * second;
                break;
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
        }
        return result;
    }
}