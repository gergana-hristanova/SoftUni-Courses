package ConditionalStatementsAdvanced_03;

import java.util.Scanner;

public class CarToGo_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //въвеждаме данните
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        //дефинираме променливи за:
        String classType = ""; //класа на колата
        String carType = ""; //типа на колата
        double carCost = 0; //цената на колата
        //проверяваме стойността на бюджета
        if (budget <= 100) {
            classType = "Economy class";
            //проверяваме сезона
            switch (season) {
                case "Summer":
                    carType = "Cabrio";
                    carCost = budget * 0.35;
                    break;
                case "Winter":
                    carType = "Jeep";
                    carCost = budget * 0.65;
                    break;
            }
        } else if (budget <= 500) {
            classType = "Compact class";
            switch (season) {
                case "Summer":
                    carType = "Cabrio";
                    carCost = budget * 0.45;
                    break;
                case "Winter":
                    carType = "Jeep";
                    carCost = budget * 0.80;
                    break;
            }
        } else {
            classType = "Luxury class";
            carType = "Jeep";
            carCost = budget * 0.90;
        }
        //извеждаме резултата
        System.out.println(classType);
        System.out.printf("%s - %.2f", carType, carCost);
    }
}