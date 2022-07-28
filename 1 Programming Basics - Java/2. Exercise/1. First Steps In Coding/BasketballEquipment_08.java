package FirstStepsInCoding_01;

import java.util.Scanner;

public class BasketballEquipment_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tax = Integer.parseInt(scanner.nextLine());

        double sneakers = tax - (tax * 0.4);
        double outfit = sneakers - (sneakers * 0.2);
        double ball = outfit / 4;
        double accessories = ball / 5;

        double total = tax + sneakers + outfit + ball + accessories;

        System.out.println(total);
        //or System.out.printf("%.2f", total);
    }
}