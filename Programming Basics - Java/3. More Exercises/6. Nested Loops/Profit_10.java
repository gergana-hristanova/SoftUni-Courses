package NestedLoops_06;

import java.util.Scanner;

public class Profit_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //lv1s - еднолевки
        //lv2s - двулевки
        //lv5s - петолевки

        int lv1sRoof = Integer.parseInt(scanner.nextLine());
        int lv2sRoof = Integer.parseInt(scanner.nextLine());
        int lv5sRoof = Integer.parseInt(scanner.nextLine());
        int wantedSum = Integer.parseInt(scanner.nextLine());

        for (int currentLv1s = 0; currentLv1s <= lv1sRoof; currentLv1s++) {
            for (int currentLv2s = 0; currentLv2s <= lv2sRoof; currentLv2s++) {
                for (int currentLv5s = 0; currentLv5s <= lv5sRoof; currentLv5s++) {
                    int currentSum = (currentLv1s) +
                                   (currentLv2s * 2) +
                                   (currentLv5s * 5);
                    if (currentSum == wantedSum) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n",
                                currentLv1s, currentLv2s, currentLv5s, wantedSum);
                    }
                }
            }
        }
    }
}