package FinalExamApril2022;

import java.util.Scanner;

public class RoomPainting_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int paintCans = Integer.parseInt(scanner.nextLine());
        int wallpaperRolls = Integer.parseInt(scanner.nextLine());
        double glovesPrice = Double.parseDouble(scanner.nextLine());
        double brushPrice = Double.parseDouble(scanner.nextLine());

        double gloves = Math.ceil(wallpaperRolls * 0.35);
        double brushes = Math.floor(paintCans * 0.48);

        double totalPrice = paintCans * 21.50 +
                            wallpaperRolls * 5.20 +
                            gloves * glovesPrice +
                            brushes * brushPrice;
        double deliveryCost = totalPrice / 15;

        System.out.printf("This delivery will cost %.2f lv.", deliveryCost);
    }
}