package WhileLoop_05;

import java.util.Scanner;

public class Coins_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());
        change = Math.round(change * 100);
        int countCoins = 0;

        while (change > 0) {

            if (change >= 200) { //2 лева
                countCoins++;
                change -= 200;
            } else if (change >= 100) { //1 лев
                countCoins++;
                change -= 100;
            } else if (change >= 50) { //50 стотинки
                countCoins++;
                change -= 50;
            } else if (change >= 20) { //20 стотинки
                countCoins++;
                change -= 20;
            }
            else if (change >= 10) { //10 стотинки
                countCoins++;
                change -= 10;
            }
            else if (change >= 5) { //5 стотинки
                countCoins++;
                change -= 5;
            }
            else if (change >= 2) { //2 стотинки
                countCoins++;
                change -= 2;
            }
            else if (change >= 1) { //1 стотинка
                countCoins++;
                change -= 1;
            }
        }

        System.out.println(countCoins);
    }
}