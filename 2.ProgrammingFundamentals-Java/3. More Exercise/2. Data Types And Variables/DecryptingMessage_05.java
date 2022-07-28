package DataTypesAndVariables_02;

import java.util.Scanner;

public class DecryptingMessage_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        byte key = Byte.parseByte(scanner.nextLine());
        byte n = Byte.parseByte(scanner.nextLine());

        String message = "";
        for (int i = 0; i < n; i++) {
            char currentChar = scanner.nextLine().charAt(0);
            message += (char) (currentChar + key);
        }

        System.out.println(message);
    }
}