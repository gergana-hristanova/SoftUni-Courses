package finalexampreparation_29_07_2022;

import java.util.Scanner;

public class ActivationKeys_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder key = new StringBuilder(scanner.nextLine());

        String[] commandLine = scanner.nextLine().split(">>>");
        while (!commandLine[0].equals("Generate")) {

            String command = commandLine[0];
            switch (command) {
                case "Contains":
                    String substringContains = commandLine[1];

                    if (key.toString().contains(substringContains)) {
                        System.out.printf("%s contains %s%n", key, substringContains);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;

                case "Flip":
                    String caseType = commandLine[1];
                    int startIndexFlip = Integer.parseInt(commandLine[2]);
                    int endIndexFlip = Integer.parseInt(commandLine[3]);

                    String substringFlip;
                    if (caseType.equals("Upper")) {
                        substringFlip = key.substring(startIndexFlip, endIndexFlip).toUpperCase();
                    } else {
                        substringFlip = key.substring(startIndexFlip, endIndexFlip).toLowerCase();
                    }
                    key.replace(startIndexFlip, endIndexFlip, substringFlip);

                    System.out.println(key);
                    break;

                case "Slice":
                    int startIndexSlice = Integer.parseInt(commandLine[1]);
                    int endIndexSlice = Integer.parseInt(commandLine[2]);

                    key.replace(startIndexSlice, endIndexSlice, "");

                    System.out.println(key);
                    break;
            }

            commandLine = scanner.nextLine().split(">>>");
        }

        System.out.printf("Your activation key is: %s%n", key);
    }
}