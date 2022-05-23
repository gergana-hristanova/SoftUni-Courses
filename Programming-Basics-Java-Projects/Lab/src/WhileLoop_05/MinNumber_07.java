package WhileLoop_05;

import java.util.Scanner;

public class MinNumber_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //въвеждаме String input
        String input = scanner.nextLine();
        //дефинираме променлива за най-малкото число
        int min = Integer.MAX_VALUE;
        //докато не сме въвели командата Stop
        while(!(input.equals("Stop"))) {
            //превръщаме input в int чрез променливата num
            int num = Integer.parseInt(input);
            //проверяваме дали въведеното число е по-голямо
            if (num < min) {
                min = num;
            }
            //въвеждаме ново число
            input = scanner.nextLine();
        }
        //след края на цикъла извеждаме най-малкото число
        System.out.println(min);
    }
}