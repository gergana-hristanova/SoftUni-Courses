package WhileLoop_05;

import java.util.Scanner;

public class MaxNumber_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //въвеждаме String input
        String input = scanner.nextLine();
        //дефинираме променлива за най-голямото число
        int max = Integer.MIN_VALUE;
        //докато не сме въвели командата Stop
        while(!(input.equals("Stop"))) {
            //превръщаме input в int чрез променливата num
            int num = Integer.parseInt(input);
            //проверяваме дали въведеното число е по-голямо
            if (num > max) {
                max = num;
            }
            //въвеждаме ново число
            input = scanner.nextLine();
        }
        //след края на цикъла извеждаме най-голямото число
        System.out.println(max);
    }
}