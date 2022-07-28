package ConditionalStatementsAdvanced_03;

import java.util.Scanner;

public class OperationsBetweenNumbers_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //въвеждаме данните
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        //дефинираме променливи за:
        double result = 0; //резултата
        String evenOrOdd = ""; //проверката дали резултатът е четен/нечетен
        boolean isZero = false; //проверката за деление на 0
        //проверяваме вида на операцията
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;

            case "-":
                result = num1 - num2;
                break;

            case "*":
                result = num1 * num2;
                break;

            case "/":
                //проверяваме дали се дели на 0
                if (num2 == 0) {
                    isZero = true;
                } else {
                    result = num1 * 1.0 / num2;
                }
                break;

            case "%":
                //проверяваме дали се дели на 0
                if (num2 == 0) {
                    isZero = true;
                } else {
                    result = num1 % num2;
                    ;
                }
                break;
        }
        //проверяваме дали резултата е четен или нечетен
        if (result % 2 == 0) {
            evenOrOdd = "even";
        } else {
            evenOrOdd = "odd";
        }

        //ако се дели на нула, изписваме грешка
        if (isZero) {
            System.out.printf("Cannot divide %d by zero", num1);
        //проверяваме вида на операцията и извеждаме резултата
        } else if (operator.equals("+") || operator.equals("-") || operator.equals("*")) {
            System.out.printf("%d %s %d = %.0f - %s",
                    num1, operator, num2, result, evenOrOdd);

        } else if (operator.equals("/")) {
            System.out.printf("%d / %d = %.2f",
                    num1, num2, result);

        } else if (operator.equals("%")) {
            System.out.printf("%d %% %d = %.0f",
                    num1, num2, result);
        }
    }
}