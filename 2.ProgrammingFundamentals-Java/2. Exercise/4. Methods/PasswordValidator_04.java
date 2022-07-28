package methods_04;

import java.util.Scanner;

public class PasswordValidator_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputPassword = scanner.nextLine();

        if (!isValidLength(inputPassword)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!isValidContent(inputPassword)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!isValidDigitsCount(inputPassword)) {
            System.out.println("Password must have at least 2 digits");
        }
        if (isValidContent(inputPassword) && isValidContent(inputPassword) && isValidDigitsCount(inputPassword)) {
            System.out.println("Password is valid");
        }
    }

    private static boolean isValidLength(String password) {
        return 6 <= password.length() && password.length() <= 10;
    }

    private static boolean isValidContent(String password) {
        for (char currentSymbol : password.toCharArray()) {
            if (!Character.isLetterOrDigit(currentSymbol)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidDigitsCount(String password) {
        byte digitsCounter = 0;
        for (char currentSymbol : password.toCharArray()) {
            if (Character.isDigit(currentSymbol)) {
                digitsCounter++;
            }
        }
        return digitsCounter >= 2;
    }
}