package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class BackIn30Minutes_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int mins = Integer.parseInt(scanner.nextLine()) + 30;

        if (mins > 59) {
            mins -= 60;
            hours++;
        }
        if (hours > 23) {
            hours -= 24;
        }

        String result = String.format("%d:%02d", hours, mins);
        System.out.println(result);
    }
}