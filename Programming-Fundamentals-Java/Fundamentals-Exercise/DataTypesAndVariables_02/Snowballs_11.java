package DataTypesAndVariables_02;

import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        byte n = Byte.parseByte(scanner.nextLine());

        double bestSnowballValue = Double.MIN_VALUE;
        short bestSnowballSnow = 0;
        short bestSnowballTime = 0;
        byte bestSnowballQuality = 0;
        for (int i = 1; i <= n; i++) {
            double snowballSnow = Short.parseShort(scanner.nextLine());
            short snowballTime = Short.parseShort(scanner.nextLine());
            byte snowballQuality = Byte.parseByte(scanner.nextLine());

            double snowballValue = Math.pow((snowballSnow / snowballTime), snowballQuality);

            if (snowballValue > bestSnowballValue) {
                bestSnowballValue = snowballValue;
                bestSnowballSnow = (short) snowballSnow;
                bestSnowballTime = snowballTime;
                bestSnowballQuality = snowballQuality;
            }
        }

        System.out.printf("%d : %d = %.0f (%d)",
                bestSnowballSnow, bestSnowballTime, bestSnowballValue, bestSnowballQuality);
    }
}