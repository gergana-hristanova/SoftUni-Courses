package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class RageExpenses_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int trashedHeadsets = lostGamesCount / 2;
        int trashedMice = lostGamesCount / 3;
        int trashedKeyboards = lostGamesCount / 6;
        int trashedDisplays = lostGamesCount / 12;

        double rageExpenses =
                trashedHeadsets * headsetPrice +
                trashedMice * mousePrice +
                trashedKeyboards * keyboardPrice +
                trashedDisplays * displayPrice;

        System.out.printf("Rage expenses: %.2f lv.", rageExpenses);
    }
}