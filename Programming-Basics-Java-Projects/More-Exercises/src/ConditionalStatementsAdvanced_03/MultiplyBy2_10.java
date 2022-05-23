package ConditionalStatementsAdvanced_03;

import java.util.Scanner;

public class MultiplyBy2_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //дефинираме числото, като му даваме неотрицателна стойност [0; +∞)
        double num = 0;
        //докато числото е по-голямо или равно на 0
        while (num >= 0) {
            //четем числото
            num = Double.parseDouble(scanner.nextLine());
            //ако числото не е отрицателно
            if (num >= 0) {
                //го умножаваме по 2
                System.out.printf("Result: %.2f%n", num * 2);
            } else {
                System.out.println("Negative number!");
            }
        }
    }
}