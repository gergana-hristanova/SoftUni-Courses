package ConditionalStatementsAdvanced_03;

import java.util.Scanner;

public class HotelRoom_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //въвеждаме данните
        String month = scanner.nextLine();
        int overnights = Integer.parseInt(scanner.nextLine());
        //дефинираме променливи за:
        double studioCostPerNight = 0; //цената за нощувка в студио
        double apartmentCostPerNight = 0; //цената за нощувка в апартамент
        //проверяваме месеца
        switch (month) {
            case "May":
            case "October":
                studioCostPerNight = 50;
                apartmentCostPerNight = 65;
                //проверяваме за отстъпки
                if (overnights > 7 && overnights <= 14) {
                    studioCostPerNight -= studioCostPerNight * 0.05;
                } else if (overnights > 14) {
                    studioCostPerNight -= studioCostPerNight * 0.3;
                }
                break;
            case "June":
            case "September":
                studioCostPerNight = 75.2;
                apartmentCostPerNight = 68.7;
                if (overnights > 14) {
                    studioCostPerNight -= studioCostPerNight * 0.2;
                }
                break;
            case "July":
            case "August":
                studioCostPerNight = 76;
                apartmentCostPerNight = 77;
                break;
        }
        //проверяваме за отстъпка за нощувки в апартамент
        if (overnights > 14) {
            apartmentCostPerNight -= apartmentCostPerNight * 0.1;
        }
        //изчисляваме крайните цени
        double studioTotalCost = studioCostPerNight * overnights;
        double apartmentTotalCost = apartmentCostPerNight * overnights;
        //извеждаме резултата
        System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.", apartmentTotalCost, studioTotalCost);
    }
}