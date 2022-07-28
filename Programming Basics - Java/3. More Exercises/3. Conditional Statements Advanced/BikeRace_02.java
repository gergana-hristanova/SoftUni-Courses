package ConditionalStatementsAdvanced_03;

import java.util.Scanner;

public class BikeRace_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //въвеждаме данните
        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String routeType = scanner.nextLine();
        //дефинираме променливи за:
        double juniorsTax = 0; //таксата за младшата група
        double seniorsTax = 0; //таксата за старшата група
        //проверяваме вида на трасето
        switch (routeType) {
            case "trail":
                juniorsTax = 5.50;
                seniorsTax = 7;
                break;
            case "cross-country":
                juniorsTax = 8;
                seniorsTax = 9.50;
                //проверяваме за отстъпка
                if (juniors + seniors >= 50) {
                    juniorsTax -= juniorsTax * 0.25;
                    seniorsTax -= seniorsTax * 0.25;
                }
                break;
            case "downhill":
                juniorsTax = 12.25;
                seniorsTax = 13.75;
                break;
            case "road":
                juniorsTax = 20;
                seniorsTax = 21.50;
                break;
        }
        //изчисляваме крайната печалба
        double totalIncome = juniors * juniorsTax + seniors * seniorsTax;
        //приспадаме 5% от нея за разходи
        totalIncome -= totalIncome * 0.05;
        //извеждаме резултата
        System.out.printf("%.2f", totalIncome);
    }
}