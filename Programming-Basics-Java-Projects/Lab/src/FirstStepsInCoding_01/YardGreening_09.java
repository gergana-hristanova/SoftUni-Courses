package FirstStepsInCoding_01;

import java.util.Scanner;

public class YardGreening_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double sqMeters = Double.parseDouble(scanner.nextLine());

        double totalPrice = sqMeters * 7.61;
        double discount = totalPrice * 0.18;
        double finalPrice = totalPrice - discount;

        System.out.printf("The final price is: %.2f lv.%n", finalPrice);
        System.out.printf("The discount is: %.2f lv.", discount);
        // %.2f - .2 казва „до два знака след десетична запетая“
    }
}