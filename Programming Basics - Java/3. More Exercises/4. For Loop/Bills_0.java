package ForLoop_04;

import java.util.Scanner;

public class Bills_0 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //въвеждаме месеците
        int months = Integer.parseInt(scanner.nextLine());
        //дефинираме променливи за:
        double totalBills = 0; //общите сметки
        double totalElectricity = 0; //общия ток
        double totalOther = 0; //общите други
        //докато не достигнем броя на месеците
        for (int i = 1; i <= months; i++) {
            //четем месечна такса за ток
            double monthlyElectricity = Double.parseDouble(scanner.nextLine());
            //прибавяме я към общата такса за тока
            totalElectricity += monthlyElectricity;
            //пресмятаме месечната такса за другите
            double monthlyOther = (monthlyElectricity + 35) + (monthlyElectricity + 35) * 0.2;
            //добавяме я към общата такса за други
            totalOther += monthlyOther;
            //добавяме месечните такси за тока и другите към общите сметки
            totalBills += monthlyElectricity + monthlyOther;
        }
        //изчисляваме общите сметки за:
        double totalWater = months * 20; //водата
        double totalInternet = months * 15; //интернета
        //прибяваме ги към общите сметки
        totalBills += totalWater + totalInternet;
        //извеждаме резултатите
        System.out.printf("Electricity: %.2f lv%n" +
                          "Water: %.2f lv%n" +
                          "Internet: %.2f lv%n" +
                          "Other: %.2f lv%n" +
                          "Average: %.2f lv%n", totalElectricity, totalWater,
                totalInternet, totalOther, totalBills / months);
    }
}