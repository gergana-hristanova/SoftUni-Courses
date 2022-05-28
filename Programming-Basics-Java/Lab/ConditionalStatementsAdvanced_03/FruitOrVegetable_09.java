package ConditionalStatementsAdvanced_03;

import java.util.Scanner;

public class FruitOrVegetable_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //въвеждаме данните
        String product = scanner.nextLine();

        switch (product) {
            //проверяваме плодовете
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                System.out.println("fruit");
                break;
            //проверяваме зеленчуците
            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                System.out.println("vegetable");
                break;
            //ако въведените данни са невалидни
            default:
                System.out.println("unknown");
                break;
        }
    }
}