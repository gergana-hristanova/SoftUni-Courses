package ConditionalStatements_02;

import java.util.Scanner;

public class FuelTankPart2_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //въвеждаме данните
        String fuelType = scanner.nextLine();
        double fuelLiters = Double.parseDouble(scanner.nextLine());
        String clubCard = scanner.nextLine();

        //дефинираме променлива за цената на горивото
        double fuelPrice = 0;

            //проверяваме дали водачът има клубна карта
            if(clubCard.equals("Yes")) {
                //проверяваме типа гориво
                switch (fuelType) {
                    case "Diesel" : {
                        fuelPrice = (2.33 - 0.12) * fuelLiters; break;
                    } //0.12 е отстъпката
                    case "Gasoline" : {
                        fuelPrice = (2.22 - 0.18) * fuelLiters; break;
                    } //0.18 е отстъпката
                    case "Gas" : {
                        fuelPrice = (0.93 - 0.08) * fuelLiters;
                    } //0.08 е отстъпката
            }
        } else { //ако няма крубна карта

                //проверяваме типа гориво
                switch (fuelType) {
                    case "Diesel" : {
                        fuelPrice = 2.33 * fuelLiters; break;
                    } //тук вече няма отстъпка
                    case "Gasoline" : {
                        fuelPrice = 2.22 * fuelLiters; break;
                    }
                    case "Gas" : {
                        fuelPrice = 0.93 * fuelLiters;
                    }
            }
    }

    //проверяваме дали литрите са между 20 и 25
    if (fuelLiters >= 20 && fuelLiters <= 25) {
        fuelPrice -= fuelPrice * 0.08;
    //проверяваме дали литрите са над 25
    } else if (fuelLiters > 25) {
        fuelPrice -= fuelPrice * 0.1;
    }
        //извеждаме резултата
        System.out.printf("%.2f lv.", fuelPrice);
}
}