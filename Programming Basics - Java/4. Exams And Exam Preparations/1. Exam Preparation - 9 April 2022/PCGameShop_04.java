package ExamPreparationMarch2022;

import java.util.Scanner;

public class PCGameShop_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double totalSoldGames = Integer.parseInt(scanner.nextLine());

        int soldHearthstone = 0;
        int soldFornite = 0;
        int soldOverwatch = 0;
        int soldOthers = 0;

        for (int i = 1; i <= totalSoldGames; i++) {
            String gameName = scanner.nextLine();
            switch (gameName) {
                case "Hearthstone":
                    soldHearthstone++;
                    break;
                case "Fornite":
                    soldFornite++;
                    break;
                case "Overwatch":
                    soldOverwatch++;
                    break;
                default:
                    soldOthers++;
                    break;
            }
        }

        System.out.printf("Hearthstone - %.2f%%%n" +
                        "Fornite - %.2f%%%n" +
                        "Overwatch - %.2f%%%n" +
                        "Others - %.2f%%",
                soldHearthstone / totalSoldGames * 100,
                soldFornite / totalSoldGames * 100,
                soldOverwatch / totalSoldGames * 100,
                soldOthers / totalSoldGames * 100);
    }
}