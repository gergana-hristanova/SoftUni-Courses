package WhileLoop_05;

import java.util.Scanner;

public class AverageNumber_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputsAmount = Integer.parseInt(scanner.nextLine());
        double inputsCounter = 0;
        int inputsSum = 0;

        while (inputsAmount != inputsCounter) {
            int input = Integer.parseInt(scanner.nextLine());
            inputsCounter++;
            inputsSum += input;
        }

        double average = inputsSum / inputsCounter;
        System.out.printf("%.2f", average);
    }
}