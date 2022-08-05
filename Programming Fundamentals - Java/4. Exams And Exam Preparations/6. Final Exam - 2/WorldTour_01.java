package final_exam_retake_02;

import java.util.Scanner;

public class WorldTour_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder stringBuilder = new StringBuilder(scanner.nextLine());

        String[] commandLine = scanner.nextLine().split(":");

        while (!commandLine[0].equals("Travel")) {
            String command = commandLine[0];

            switch (command) {
                case "Add Stop":
                    int index = Integer.parseInt(commandLine[1]);

                    if (indexIsValid(index, stringBuilder)) {
                        String destination = commandLine[2];
                        stringBuilder.insert(index, destination);
                    }
                    System.out.println(stringBuilder);
                    break;

                case "Remove Stop":
                    int startIndex = Integer.parseInt(commandLine[1]);
                    int endIndex = Integer.parseInt(commandLine[2]);

                    if (indexIsValid(startIndex, stringBuilder) && indexIsValid(endIndex, stringBuilder)) {
                        stringBuilder.replace(startIndex, endIndex + 1, "");
                    }
                    System.out.println(stringBuilder);
                    break;

                case "Switch":
                    String oldString = commandLine[1];
                    String newString = commandLine[2];

                    if (!oldString.equals(newString)) {
                        if (stringBuilder.toString().contains(oldString)) {
                            String updatedText = stringBuilder.toString().replace(oldString, newString);
                            stringBuilder = new StringBuilder(updatedText);
                        }
                    }
                    System.out.println(stringBuilder);
            }

            commandLine = scanner.nextLine().split(":");
        }

        System.out.print("Ready for world tour! Planned stops: " + stringBuilder);
}

    private static boolean indexIsValid(int index, StringBuilder text) {
        return index >= 0 && index < text.length();
    }
}