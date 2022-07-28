package DataTypesAndVariables;

import java.util.Scanner;

public class PoundsToDollars_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float brPounds = Float.parseFloat(scanner.nextLine());
        float usDollars = brPounds * 1.36f;

        System.out.printf("%.3f", usDollars);
    }
}