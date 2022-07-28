package ForLoop_04;

import java.util.Scanner;

public class Clock_09 {
    public static void main(String[] args) {

        int hours = 0;

        for (int minutes = 0; true; minutes++) {
            if (minutes > 59) {
                minutes = 0;
                hours++;
            }
            if (hours > 23) {
                break;
            }
            System.out.printf("%d : %d%n", hours, minutes);
        }
    }
}