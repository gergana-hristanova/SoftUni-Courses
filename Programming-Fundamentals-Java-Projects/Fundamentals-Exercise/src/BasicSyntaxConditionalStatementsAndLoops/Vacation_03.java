package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int groupSize = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String weekDay = scanner.nextLine();

        double pricePerPerson = 0;
        switch(groupType) {
            case "Students":
                switch(weekDay) {
                    case "Friday":
                        pricePerPerson = 8.45;
                        break;
                    case "Saturday":
                        pricePerPerson = 9.8;
                        break;
                    case "Sunday":
                        pricePerPerson = 10.46;
                        break;
                }
                break;
            case "Business":
                switch(weekDay) {
                    case "Friday":
                        pricePerPerson = 10.9;
                        break;
                    case "Saturday":
                        pricePerPerson = 15.6;
                        break;
                    case "Sunday":
                        pricePerPerson = 16;
                        break;
                }
                break;
            case "Regular":
                switch(weekDay) {
                    case "Friday":
                        pricePerPerson = 15;
                        break;
                    case "Saturday":
                        pricePerPerson = 20;
                        break;
                    case "Sunday":
                        pricePerPerson = 22.5;
                        break;
                }
        }

        double totalPrice = pricePerPerson * groupSize;

        if (groupType.equals("Students") && groupSize >= 30) {
            totalPrice -= totalPrice * 0.15;
        }
        if (groupType.equals("Business") && groupSize >= 100) {
            totalPrice -= pricePerPerson * 10;
        }
        if (groupType.equals("Regular") && groupSize >= 10 && groupSize <= 20) {
            totalPrice -= totalPrice * 0.05;
        }

        System.out.printf("Total price: %.2f", totalPrice);
    }
}