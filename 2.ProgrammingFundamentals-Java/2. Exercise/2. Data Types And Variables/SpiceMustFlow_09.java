package DataTypesAndVariables_02;

import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());

        int storage = 0;
        byte dayCounter = 0;
        while (startingYield >= 100) {
            storage += startingYield;

            storage -= 26;
            dayCounter++;
            startingYield -= 10;
        }

        if (storage < 26) {
            storage = 0;
        } else {
            storage -= 26;
        }

        System.out.println(dayCounter);
        System.out.println(storage);
    }
}