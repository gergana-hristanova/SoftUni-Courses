package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double pricePerSaber = Double.parseDouble(scanner.nextLine());
        double pricePerRobe = Double.parseDouble(scanner.nextLine());
        double pricePerBelt = Double.parseDouble(scanner.nextLine());

        double priceSabers = Math.ceil(studentsCount + studentsCount * 0.1) * pricePerSaber;

        double priceRobes = studentsCount * pricePerRobe;

        double priceBelts = studentsCount * pricePerBelt;
        priceBelts -= Math.floor(studentsCount / 6.0) * pricePerBelt;

        double totalPrice = priceSabers + priceRobes + priceBelts;

        if (budget >= totalPrice) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", totalPrice - budget);
        }
    }
}