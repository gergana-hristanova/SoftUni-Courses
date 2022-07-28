package methods_04;

import java.util.Scanner;

public class RepeatString_07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stringToRepeat = scanner.nextLine();
        int timesToRepeat = Integer.parseInt(scanner.nextLine());

        String output = repeatString(stringToRepeat, timesToRepeat);

        System.out.println(output);
    }

    public static String repeatString(String string, int repeats) {
        String result = "";
        for (int i = 0; i < repeats; i++) {
            result += string;
        }
        return result;
    }
}