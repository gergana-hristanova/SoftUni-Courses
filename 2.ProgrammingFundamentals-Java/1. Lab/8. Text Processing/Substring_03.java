package textprocessing_08;

import java.util.Scanner;

public class Substring_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String substring = scanner.nextLine();
        String string = scanner.nextLine();

        int index = string.indexOf(substring);
        while (index != -1) {
            string = string.replace(substring, "");
            index = string.indexOf(substring);
        }

        System.out.println(string);
    }
}