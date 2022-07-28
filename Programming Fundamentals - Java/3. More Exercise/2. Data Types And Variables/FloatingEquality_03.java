package DataTypesAndVariables_02;

import java.math.BigDecimal;
import java.util.Scanner;

public class FloatingEquality_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double firstNumber = Double.parseDouble(scanner.nextLine());
        double secondNumber = Double.parseDouble(scanner.nextLine());

        boolean areEqual = Math.abs(firstNumber - secondNumber) < 0.000001;
        if (areEqual) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
