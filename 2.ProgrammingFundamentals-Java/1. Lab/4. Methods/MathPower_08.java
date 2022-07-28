package methods_04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower_08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberInput = Double.parseDouble(scanner.nextLine());
        double powerInput = Double.parseDouble(scanner.nextLine());

        System.out.println(new DecimalFormat("0.####").format(getPoweredNumber(numberInput, powerInput)));
    }

    public static double getPoweredNumber(double number, double power) {
        double product = 1;
        for (int i = 1; i <= power; i++) {
            product *= number;
        }
        return product;
    }
}