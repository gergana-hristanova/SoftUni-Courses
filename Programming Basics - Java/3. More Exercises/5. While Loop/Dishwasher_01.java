package WhileLoop_05;

import java.util.Scanner;

public class Dishwasher_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //въвеждаме входните данни
        int bottlesDetergent = Integer.parseInt(scanner.nextLine());
        //пресмятаме наличния препарат в мл.
        int mlDetergent = bottlesDetergent * 750;
        //дефинираме променливи за:
        String input = scanner.nextLine(); //входа на цикъла
        int threesCounter = 0; //брояч за всеки три зареждания
        int dishesCounter = 0; //брояч за съдове
        int potsCounter = 0; //брояч за тенждери
        int neededDetergent = 0; //нужен препарат в мл.
        boolean notEnoughDetergent = false; //проверка дали е свършил препаратът
        //докато не въведем команда End
        while (!input.equals("End")) {
            //чрез int dishes превръщаме String input в integer
            int dishes = Integer.parseInt(input);
            threesCounter++; //отрбояваме едно зареждане
            //ако броят на зарежданията достигне 3
            if (threesCounter == 3) {
                threesCounter = 0; //го нулираме
                neededDetergent += dishes * 15;
                potsCounter += dishes;
            } else {
                neededDetergent += dishes * 5;
                dishesCounter += dishes;
            }
            //проверяваме дали препаратът не е свършил
            if (neededDetergent > mlDetergent) {
                notEnoughDetergent = true;
                break;
            } else {
                input = scanner.nextLine();
            }
        }

        if (notEnoughDetergent) {
            System.out.printf("Not enough detergent, %d ml. more necessary!",
                    neededDetergent - mlDetergent);
        } else {
            System.out.printf("Detergent was enough!\n" +
                    "%d dishes and %d pots were washed.\n" +
                    "Leftover detergent %d ml.",
                    dishesCounter, potsCounter, mlDetergent - neededDetergent);
        }
    }
}