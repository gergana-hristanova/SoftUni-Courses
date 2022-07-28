package ConditionalStatementsAdvanced_03;

import java.util.Scanner;

public class SmallShop_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //въвеждаме данните
        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        //дефинираме променливи за цените на всеки продукт
        double coffeePrice = 0;
        double waterPrice = 0;
        double beerPrice = 0;
        double sweetsPrice = 0;
        double peanutsPrice = 0;
        //дефинираме променлива за изходната цена
        double outputPrice = 0;

        //проверяваме града
        switch (town) {
            //задаваме цените на продуктите за София
            case "Sofia":
                coffeePrice = 0.5;
                waterPrice = 0.8;
                beerPrice = 1.2;
                sweetsPrice = 1.45;
                peanutsPrice = 1.6;
                break;
            //задаваме цените на продуктите за Пловдив
            case "Plovdiv":
                coffeePrice = 0.4;
                waterPrice = 0.7;
                beerPrice = 1.15;
                sweetsPrice = 1.3;
                peanutsPrice = 1.5;
                break;
            //задаваме цените на продуктите за Варна
            case "Varna":
                coffeePrice = 0.45;
                waterPrice = 0.7;
                beerPrice = 1.1;
                sweetsPrice = 1.35;
                peanutsPrice = 1.55;
                break;
        }

        //проверяваме продукта
        switch (product) {
            //ако е кафе
            case "coffee":
                outputPrice = coffeePrice * quantity;
                break;
            //ако е вода
            case "water":
                outputPrice = waterPrice * quantity;
                break;
            //ако е бира
            case "beer":
                outputPrice = beerPrice * quantity;
                break;
            //ако са сладки
            case "sweets":
                outputPrice = sweetsPrice * quantity;
                break;
            //ако са фъстъци
            case "peanuts":
                outputPrice = peanutsPrice * quantity;
                break;
        }

        //извеждаме резултата
        System.out.println(outputPrice);
    }
}