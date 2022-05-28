package ConditionalStatementsAdvanced_03;

import java.util.Scanner;

public class TradeCommissions_12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());

        double commision = 0;
        boolean isInvalid = false;

        switch (town) {
            case "Sofia":
                if (sales >= 0 && sales <= 500) {
                    commision = sales * 0.05;
                } else if (sales > 500 && sales <= 1000) {
                    commision = sales * 0.07;
                } else if (sales > 1000 && sales <= 10000) {
                    commision = sales * 0.08;
                } else if (sales > 10000) {
                    commision = sales * 0.12;
                } else {
                    isInvalid = true;
                }
                break;
            case "Varna":
                if (sales >= 0 && sales <= 500) {
                    commision = sales * 0.045;
                } else if (sales > 500 && sales <= 1000) {
                    commision = sales * 0.075;
                } else if (sales > 1000 && sales <= 10000) {
                    commision = sales * 0.10;
                } else {
                    commision = sales * 0.13;
                }
                break;
            case "Plovdiv":
                if (sales >= 0 && sales <= 500) {
                    commision = sales * 0.055;
                } else if (sales > 500 && sales <= 1000) {
                    commision = sales * 0.08;
                } else if (sales > 1000 && sales <= 10000) {
                    commision = sales * 0.12;
                } else if (sales > 10000) {
                    commision = sales * 0.145;
                } else {
                    isInvalid = true;
                }
                break;
            default:
                isInvalid = true;
        }

        if (isInvalid) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f", commision);
        }
    }
}