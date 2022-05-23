package ForLoop_04;

import java.util.Scanner;

public class CleverLily_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //въвеждаме данните
        int n = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toysPrice = Integer.parseInt(scanner.nextLine());
        //дефинираме променливи за
        int oddOrEven = 0; //проверка дали рожденият ден е четен или не
        int moneyFromBirthdays = 0; //парите, събрани от четни рождени дни
        int additionalMoneyPerBirthday = 0; //парите, които ѝ дават на рожден ден
        int toysAmount = 0; //броя играчки

        for (int i = 1; i <= n; i ++) {
            oddOrEven++; //отчитаме поредността на рождения ден
            //проверяваме дали рожденият ден е четен или не
            if (oddOrEven % 2 == 0) {
                additionalMoneyPerBirthday += 10;
                moneyFromBirthdays += additionalMoneyPerBirthday - 1;
            } else {
                toysAmount ++;
            }
        }
        //изчисляваме
        int moneyFromToys = toysAmount * toysPrice; //парите, събрани от играчки
        double allMoney = moneyFromBirthdays + moneyFromToys; //всичките пари
        double diff = Math.abs(allMoney - washingMachinePrice); //разликата
        //проверяваме дали парите стигат за пералнята
        if (allMoney >= washingMachinePrice) {
            System.out.printf("Yes! %.2f", diff);
        } else {
            System.out.printf("No! %.2f", diff);
        }
    }
}