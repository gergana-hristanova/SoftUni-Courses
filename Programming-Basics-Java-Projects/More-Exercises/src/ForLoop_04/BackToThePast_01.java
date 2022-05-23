package ForLoop_04;

import java.util.Scanner;

public class BackToThePast_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int yearsOld = 17;

        double money = Double.parseDouble(scanner.nextLine());
        int endingYear = Integer.parseInt(scanner.nextLine());

        for (int i = 1800; i <= endingYear; i++) {
            yearsOld++;
            if (i % 2 == 0) {
                money -= 12000;
            } else {
                money -= 12000 + 50 * yearsOld;
            }
        }

        if (money >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", money);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(money));
        }
    }
}