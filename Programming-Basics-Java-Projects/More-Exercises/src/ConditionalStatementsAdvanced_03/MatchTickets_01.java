package ConditionalStatementsAdvanced_03;

import java.util.Scanner;

public class MatchTickets_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //въвеждаме данните
        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());
        //проверяваме колко % от бюджета отива за транспорт
        if (people >= 1 && people <= 4) {
            budget -= budget * 0.75;
        } else if (people <= 9) {
            budget -= budget * 0.60;
        } else if (people <= 24) {
            budget -= budget * 0.50;
        } else if (people <= 49) {
            budget -= budget * 0.40;
        } else {
            budget -= budget * 0.25;
        }
        //дефинираме променлива за цената на билетите
        double ticketCost = 0;
        //проверяваме категорията на билетите и колко струват
        if (category.equals("VIP")) {
            ticketCost = people * 499.99;
        } else {
            ticketCost = people * 249.99;
        }
        //изчисляваме разликата между цената на билетите и бюждета
        double diff = Math.abs(ticketCost - budget);
        //проверяваме дали бюджета стига за билетите
        if (budget >= ticketCost) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}