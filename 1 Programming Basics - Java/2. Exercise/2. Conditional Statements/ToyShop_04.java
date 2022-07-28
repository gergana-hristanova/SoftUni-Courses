package ConditionalStatements_02;

import java.util.Scanner;

public class ToyShop_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //въвеждаме всички данни
        double vacationPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        //изчисляваме печалбата от продажбите на играчки
        double income = puzzles * 2.6 + dolls * 3 + bears * 4.1 + minions * 8.2 + trucks * 2;
        //изчисляваме броя на играчките
        int toysNumber = puzzles + dolls + bears + minions + trucks;

        //проверяваме дали иглачките са повече от 50
        if (toysNumber >= 50) {
            //ако са, изваждаме 25% от печалбата (тстъпка)
            income -= income * 0.25;
        }
        //изваждаме още 10% от печалбата (за наем)
        income -= income * 0.1;

        //проверяваме дали имаме достатъчно пари
        if (vacationPrice <= income) {
            System.out.printf("Yes! %.2f lv left.", (income - vacationPrice));
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", (vacationPrice - income));
        }
    }
}