package FirstStepsInCoding_01;

import java.util.Scanner;

public class DepositCalculator_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double deposit = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double interest = Double.parseDouble(scanner.nextLine());

        double finalSum = deposit + months * ((deposit * (interest / 100) / 12));

        System.out.println(finalSum);
    }
}