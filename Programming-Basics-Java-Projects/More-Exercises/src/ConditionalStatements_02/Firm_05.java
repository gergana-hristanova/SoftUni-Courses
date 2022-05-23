package ConditionalStatements_02;

import java.util.Scanner;

public class Firm_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //въвеждаме данните
        int neededHours = Integer.parseInt(scanner.nextLine());
        int totalDays = Integer.parseInt(scanner.nextLine());
        int overtimeWorkers = Integer.parseInt(scanner.nextLine());

        //изчисляваме колко дни всъщност ще се работи
        double actualDays = totalDays - totalDays * 0.1;
        //изчисляваме нормалните работни часове
        double normalWorkHours = actualDays * 8;
        //изчисляваме извънработните работни часове
        double overtimeWorkHours = overtimeWorkers * 2 * totalDays;
        //изчисляваме всичките работни цасове
        double totalWorkHours = Math.floor(normalWorkHours + overtimeWorkHours);

        //проверяваме дали всичките работни часове надвишават нужното време
        if (neededHours <= totalWorkHours) {
            System.out.printf("Yes!%.0f hours left.",
                    totalWorkHours - neededHours);
        } else {
            System.out.printf("Not enough time!%.0f hours needed.",
                    neededHours - totalWorkHours);
        }
    }
}