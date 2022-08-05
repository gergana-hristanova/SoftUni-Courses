package final_exam_retake_03;

import java.util.Collections;
import java.util.Scanner;

public class SecretChat_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder secretMessage = new StringBuilder(scanner.nextLine());

        String[] commandLine = scanner.nextLine().split(":\\|:");
        while (!commandLine[0].equals("Reveal")) {

            String command = commandLine[0];
            switch (command) {
                case "InsertSpace":
                    int index = Integer.parseInt(commandLine[1]);

                    secretMessage.insert(index, " ");

                    System.out.println(secretMessage);
                    break;

                case "Reverse":
                    String substring = commandLine[1];

                    if (secretMessage.toString().contains(substring)) {
                        int startSubstringIndex = secretMessage.indexOf(substring);
                        int endSubstringIndex = startSubstringIndex + substring.length();
                        secretMessage.delete(startSubstringIndex, endSubstringIndex);

                        StringBuilder substringBuilder = new StringBuilder(substring);
                        substringBuilder.reverse();
                        secretMessage.append(substringBuilder);

                        System.out.println(secretMessage);
                    } else {
                        System.out.println("error");
                    }
                    break;

                case "ChangeAll":
                    String replacee = commandLine[1];
                    String replacement = commandLine[2];

                        String secretMessageString = secretMessage.toString().replace(replacee, replacement);
                        secretMessage = new StringBuilder(secretMessageString);

                    System.out.println(secretMessage);
                    break;
            }

            commandLine = scanner.nextLine().split(":\\|:");
        }

        System.out.println("You have a new text message: " + secretMessage);
    }
}
