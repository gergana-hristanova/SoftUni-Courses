package NestedLoops_06;

import java.util.Scanner;

public class Travelling_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //въвеждаме входа (дестинация или команда End)
        String input = scanner.nextLine();
        //докато входът не е командата End
        while (!input.equals("End")) {
            //четем нужната сума за пътуването
            double neededMoney = Double.parseDouble(scanner.nextLine());
            //дефинираме променлива за събраните пари
            double savedMoney = 0;
            //докато събраните пари не са достатъчни за пътуването
            while (savedMoney < neededMoney) {
                //четем спестени пари от работа
                double dailyIncome = Double.parseDouble(scanner.nextLine());
                //добавяме парите от работа към спестените пари
                savedMoney += dailyIncome;
            }
            //след приключване на цикъла, извеждаме резултата
            System.out.printf("Going to %s!%n", input);
            //четем нов вход
            input = scanner.nextLine();
        }
    }
}