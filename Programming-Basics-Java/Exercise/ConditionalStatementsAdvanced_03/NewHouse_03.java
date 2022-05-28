package ConditionalStatementsAdvanced_03;

import java.util.Scanner;

public class NewHouse_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //въвеждаме данните
        String flowersType = scanner.nextLine();
        int flowersAmount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        //инициализираме променлива за цената
        double cost = 0;
        //проверяваме вида цветя
        switch (flowersType) {
            case "Roses":
                cost = flowersAmount * 5; //намираме цената
                //проверяваме за отстъпка
                if (flowersAmount > 80) {
                cost -= cost * 0.1;
                }
                break;
            case "Dahlias":
                cost = flowersAmount * 3.8;
                if (flowersAmount > 90) {
                    cost -= cost * 0.15;
                }
                break;
            case "Tulips":
                cost = flowersAmount * 2.8;
                if (flowersAmount > 80) {
                    cost -= cost * 0.15;
                }
                break;
            case "Narcissus":
                cost = flowersAmount * 3;
                if (flowersAmount < 120) {
                    cost += cost * 0.15;
                }
                break;
            case "Gladiolus":
                cost = flowersAmount * 2.5;
                if (flowersAmount < 80) {
                    cost += cost * 0.2;
                }
                break;
        }
        //проверяваме дали бюджета е достатъчен
        if (budget >= cost) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",
                    flowersAmount, flowersType, budget - cost);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", cost - budget);
        }
    }
}