package FinalExamRetake_01;

import java.util.Scanner;

public class TheImitationGame_01 {

    public static void main(String[] args) {
        //creating a scanner
        Scanner scanner = new Scanner(System.in);

        //reading the encrypted message as a StringBuilder
        StringBuilder message = new StringBuilder(scanner.nextLine());

        //reading the first commandLine as a String array
        //example: "ChangeAll|z|l" -> ["ChangeAll", "z", "l"]
        String[] commandLine = scanner.nextLine().split("\\|");

        //checking whether the input was ["Decode"]
        while(!commandLine[0].equals("Decode")) {

            //if it is not, we save the command as a String
            String command = commandLine[0];
            //and we check which command it is
            switch (command) {
                case "Move":
                    //taking the numberOfLetters from the commandLine array
                    //example: ["Move", "3"] -> 3
                    int numberOfLetters = Integer.parseInt(commandLine[1]);

                    //saving the symbol we need to move in a substring
                    //example if we need to move 3 symbols:
                    //"Minecraft" -> substring = "Min"
                    String substring = message.substring(0, numberOfLetters);
                    //removing the symbols from the message
                    message.replace(0, numberOfLetters, "");
                    //adding the substring at the end of the message
                    message.append(substring);
                    break;

                case "Insert":
                    //taking the index from the commandLine array
                    //example: ["Insert", "2", "o"] -> 2
                    int index = Integer.parseInt(commandLine[1]);
                    //taking the value from the commandLine array
                    //example: ["Insert", "2", "o"] -> "o"
                    String value = commandLine[2];

                    //inserting the value at the index
                    //example with Insert|2|o:
                    //"Minecraft" -> "Mionecraft"
                    message.insert(index, value);
                    break;

                case "ChangeAll":
                    //taking the substring that needs replacing from the commandLine array
                    //example: ["ChangeAl", "z", "l"] -> "z"
                    String replaced = commandLine[1];
                    //taking the replacement from the commandLine array
                    //example: ["ChangeAl", "z", "l"] -> "l"
                    String replacement = commandLine[2];

                    //saving the message in a separate String
                    String messageString = message.toString();
                    //checking whether the messageString contains replaced

                    if (messageString.contains(replaced)) {
                        //if it does, we replace it with the replacement
                        //ATTENTION: do not use .replaceAll, as it uses a regex
                        messageString = messageString.replace(replaced, replacement);
                    }
                    //updating the StringBuilder message with the value of messageString
                    message = new StringBuilder(messageString);
                    break;
            }
            //reading the next command
            commandLine = scanner.nextLine().split("\\|");
        }

        //outputing the final result
        System.out.printf("The decrypted message is: %s", message);
    }
}