package Arrays_03;

import java.util.Scanner;

public class ReverseArrayOfStrings_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] stringsArray = input.split(" ");

        for (int i = stringsArray.length - 1; i >= 0; i--) {
            System.out.print(stringsArray[i] + " ");
        }
    }
}