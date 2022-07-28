package ConditionalStatements_02;

import java.util.Scanner;

public class TimePlus15Minutes_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //въвеждаме час и минути
        int inputHour = Integer.parseInt(scanner.nextLine());
        int inputMinutes = Integer.parseInt(scanner.nextLine());
        //проверки, чрез които осигуряваме цикъла на времето
        if (inputMinutes >= 45) {
            inputHour ++;
        }
        if (inputHour > 23) {
            inputHour = 0;
        }
        //изчисляваме крайния резултат
        int totalTime = inputHour * 60 + inputMinutes;
        int finalTime = totalTime + 15;
        int finalHour = totalTime / 60;
        int finalMinutes = finalTime % 60;
        //извеждаме резултата
        System.out.printf("%d:%02d", finalHour, finalMinutes);
    }
}