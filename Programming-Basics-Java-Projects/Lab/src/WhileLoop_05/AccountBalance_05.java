package WhileLoop_05;

import java.util.Scanner;

public class AccountBalance_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //въвеждаме някакъв String input
        String input = scanner.nextLine();
        //дефинираме променлива за сумата на числата
        double sum = 0;
        //докато input не е командата NoMoreMoney
        while (!(input.equals("NoMoreMoney"))) {
            //превръщаме input в double чрез променливата num
            double num = Double.parseDouble(input);
            //проверяваме дали num е отрицателно число
            if (num < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            //извеждаме вноската
            System.out.printf("Increase: %.2f%n", num);
            //добавяме вноската в сумата
            sum += num;
            //четем нов input
            input = scanner.nextLine();
        }
        //след края на цикъла извеждаме сумата
        System.out.printf("Total: %.2f", sum);
    }
}