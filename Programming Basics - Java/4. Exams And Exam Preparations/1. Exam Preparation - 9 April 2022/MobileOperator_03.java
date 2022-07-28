package ExamPreparationMarch2022;

import java.util.Scanner;

public class MobileOperator_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String contractDuration = scanner.nextLine();
        String contractType = scanner.nextLine();
        String mobileInternet = scanner.nextLine();
        int months = Integer.parseInt(scanner.nextLine());

        double monthlyTax = 0;
        switch (contractDuration) {
            case "one":
                switch (contractType) {
                    case "Small":
                        monthlyTax = 9.98;
                        break;
                    case "Middle":
                        monthlyTax = 18.99;
                        break;
                    case "Large":
                        monthlyTax = 25.98;
                        break;
                    case "ExtraLarge":
                        monthlyTax = 35.99;
                        break;
                }
                break;
            case "two":
                switch (contractType) {
                    case "Small":
                        monthlyTax = 8.58;
                        break;
                    case "Middle":
                        monthlyTax = 17.09;
                        break;
                    case "Large":
                        monthlyTax = 23.59;
                        break;
                    case "ExtraLarge":
                        monthlyTax = 31.79;
                        break;
                }
        }
        if (mobileInternet.equals("yes")) {
            if (monthlyTax <= 10) {
                monthlyTax += 5.50;
            } else if (monthlyTax <= 30) {
                monthlyTax += 4.35;
            } else {
                monthlyTax += 3.85;
            }
        }
        double totalTax = monthlyTax * months;
        if (contractDuration.equals("two")) {
            totalTax -= totalTax * 0.0375;
        }
        System.out.printf("%.2f lv.", totalTax);
    }
}