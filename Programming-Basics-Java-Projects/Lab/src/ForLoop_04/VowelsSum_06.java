package ForLoop_04;

import java.util.Scanner;

public class VowelsSum_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int length = input.length();
        int sum = 0;

        for (int i = 0; i < length; i++) {
            char letter = input.charAt(i);
            switch (letter) {
                case 'a':
                    sum += 1;
                    break;
                case 'e':
                    sum += 2;
                    break;
                case 'i':
                    sum += 3;
                    break;
                case 'o':
                    sum += 4;
                    break;
                case 'u':
                    sum += 5;
                    break;
            }
        }

        System.out.println(sum);
    }
}