package WhileLoop_05;

import java.util.Scanner;

public class SumNumbers_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //въвеждаме началното число
        int initialNumber = Integer.parseInt(scanner.nextLine());
        //дефинираме променлива за сумата на останалите числа
        int sum = 0;
        //докато тази сума е по малка от началното число
        while (sum < initialNumber) {
            //четем число и го прибавяме към сумата
            int num = Integer.parseInt(scanner.nextLine());
            sum += num;
        }
        //след приключваме на цикъла принтираме сумата
        System.out.println(sum);
    }
}