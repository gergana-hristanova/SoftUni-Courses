package final_exam_04;

import java.util.Scanner;

public class PasswordReset_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder password = new StringBuilder(scanner.nextLine());

        String[] commandLine = scanner.nextLine().split(" ");
        while (!commandLine[0].equals("Done")) {

            String command = commandLine[0];
            switch (command) {
                case "TakeOdd":
                    StringBuilder newPassword = new StringBuilder();

                    for (int i = 0; i < password.length(); i++) {
                        if (i % 2 != 0) {
                            newPassword.append(password.charAt(i));
                        }
                    }

                    password = newPassword;
                    System.out.println(password);
                    break;

                case "Cut":
                    int startSubstringIndex = Integer.parseInt(commandLine[1]);
                    int length = Integer.parseInt(commandLine[2]);

                    int endSubstringIndex = startSubstringIndex + length;

                    password.delete(startSubstringIndex, endSubstringIndex);

                    System.out.println(password);
                    break;

                case "Substitute":
                    String substring = commandLine[1];

                    if (password.toString().contains(substring)) {
                        String substitute = commandLine[2];

                        String passwordString = password.toString().replace(substring, substitute);
                        password = new StringBuilder(passwordString);

                        System.out.println(password);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }

            commandLine = scanner.nextLine().split(" ");
        }

        System.out.println("Your password is: " + password);
    }
}