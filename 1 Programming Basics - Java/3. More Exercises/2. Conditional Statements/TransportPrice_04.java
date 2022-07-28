package ConditionalStatements_02;

import java.util.Scanner;

public class TransportPrice_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //въвеждаме данните
        int kilometers = Integer.parseInt(scanner.nextLine());
        String dayOrNight = scanner.nextLine();
        //задаваме променлива за цената
        double price = 0;

        //проверяваме дали километрите са под 20
        if (kilometers < 20) {
            if (dayOrNight.equals("day")) { //ако пътуваме през деня
                price = kilometers * 0.79 + 0.7;
            } else { //ако пътуваме през нощта
                price = kilometers * 0.9 + 0.7;
            }
        //проверяваме дали километрите са под 100
        } else if (kilometers < 100) {
            price = kilometers * 0.09;
        //ако километрите са >= 100
        } else {
            price = kilometers * 0.06;
        }

        //извеждаме резултата
        System.out.printf("%.2f", price);
    }
}