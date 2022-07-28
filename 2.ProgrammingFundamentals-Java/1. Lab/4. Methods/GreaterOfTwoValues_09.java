package methods_04;

import java.util.Scanner;

public class GreaterOfTwoValues_09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String valuesType = scanner.nextLine();

        switch(valuesType) {
            case "int":
                int firstInt = Integer.parseInt(scanner.nextLine());
                int secondInt = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(firstInt, secondInt));
                break;
            case "char":
                char firstChar = scanner.nextLine().charAt(0);
                char secondChar = scanner.nextLine().charAt(0);
                System.out.println(getMax(firstChar, secondChar));
                break;
            case "string":
                String firstString = scanner.nextLine();
                String secondString = scanner.nextLine();
                System.out.println(getMax(firstString, secondString));
                break;
        }
    }

    public static int getMax(int first, int second) {
        return Math.max(first, second);
    }

    public static char getMax(char first, char second) {
        if (first >= second) {
            return first;
        } else {
            return second;
        }
    }

    public static String getMax(String first, String second) {
        if (first.compareTo(second) >= 0) {
            return first;
        } else {
            return second;
        }
    }
}