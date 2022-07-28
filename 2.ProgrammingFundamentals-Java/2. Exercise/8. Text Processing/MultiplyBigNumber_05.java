package textprocessing_08;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger firstNumber = new BigInteger(scanner.nextLine());
        BigInteger secondNumber = new BigInteger(scanner.nextLine());

        BigInteger product = firstNumber.multiply(secondNumber);
        System.out.println(product);
    }
}