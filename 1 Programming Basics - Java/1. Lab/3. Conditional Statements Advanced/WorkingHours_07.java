package ConditionalStatementsAdvanced_03;

import java.util.Scanner;

public class WorkingHours_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //въвеждаме данните
        int time = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        //проверяваме дали денят е неделя
        if (day.equals("Sunday")) {
            System.out.println("closed");
        } else {
            //проверяваме дали часът е между 10 и 18
            if (time >= 10 && time <= 18) {
                System.out.println("open");
            } else {
                System.out.println("closed");
            }
        }
    }
}