package BasicSyntaxConditionalStatementsAndLoops;

import java.io.PushbackReader;
import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String username = scanner.nextLine();
        String password = "";

        for (int position = username.length() - 1; position >= 0; position--) {
            char currentSymbol = username.charAt(position);
            password += currentSymbol;
        }

        String input = scanner.nextLine();
        int triesCounter = 1;

        while (!input.equals(password)) {
            System.out.println("Incorrect password. Try again.");
            triesCounter++;
            input = scanner.nextLine();

            if (triesCounter == 4) {
                System.out.printf("User %s blocked!", username);
                break;
            }
        }
        if (input.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }
    }
}