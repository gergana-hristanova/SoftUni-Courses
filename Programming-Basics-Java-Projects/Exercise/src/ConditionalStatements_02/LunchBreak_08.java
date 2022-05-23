package ConditionalStatements_02;

import java.util.Scanner;

public class LunchBreak_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //въвеждаме данните
        String tvShowName = scanner.nextLine();
        int episodeTime = Integer.parseInt(scanner.nextLine());
        int breakTime = Integer.parseInt(scanner.nextLine());

        //изчисляваме свободното време за гледане на сериал
        double relaxTime = breakTime / 4.0;
        double lunchTime = breakTime / 8.0;
        double freeTime = breakTime - (relaxTime + lunchTime);

        //изчисляваме разликата между дължината на епизода и свободното време
        double timeDifference = Math.ceil(Math.abs(episodeTime - freeTime));

        //проверяваме дали дължината на епизода надвишава свободното време
        if (episodeTime <= freeTime) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",
                    tvShowName, timeDifference);
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",
                    tvShowName, timeDifference);
        }
    }
}