package WhileLoop_05;

import java.util.Scanner;

public class Walking_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //дефинираме променливи за:
        boolean goalReached = false; //проверка дали е достигната целта
        int totalSteps = 0; //общо извървените стъпки
        //докато целта не е достигната:
        while (!goalReached) {
            //четем някакъв вход String
            String input = scanner.nextLine();
            //дефинираме променлива за извървените стъпките
            int stepsPerWalk = 0;
            //проверяваме дали е въведена команда Going home
            if (input.equals("Going home")) { //ако да:
                //чрез stepsPerWalk трансформираме input в integer
                stepsPerWalk = Integer.parseInt(scanner.nextLine());
                //добавяме извървените стъпки към общо извървените стъпки
                totalSteps += stepsPerWalk;
                //проверяваме дали целта е достигната
                if (totalSteps >= 10000) {
                    goalReached = true;
                }
                break; //спираме цикъла
            }
            //ако не е въведена команда Going home:
            //чрез stepsPerWalk трансформираме input в integer
            stepsPerWalk = Integer.parseInt(input);
            //добавяме извървените стъпки към общо извървените стъпки
            totalSteps += stepsPerWalk;
            //проверяваме дали целта е достигната
            if (totalSteps >= 10000) {
                goalReached = true;
            }
        }
        //ако целта е достигната
        if (goalReached) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", totalSteps - 10000);
        } else { //ако не е
            System.out.printf("%d more steps to reach goal.", 10000 - totalSteps);
        }
    }
}