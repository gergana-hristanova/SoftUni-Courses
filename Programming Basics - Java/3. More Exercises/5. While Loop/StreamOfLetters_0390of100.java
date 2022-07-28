package WhileLoop_05;

import java.util.Scanner;

public class StreamOfLetters_0390of100 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int cCounter = 0;
        int oCounter = 0;
        int nCounter = 0;
        String word = "";

        while (!input.equals("End")) {

            if (input.equals("c") && cCounter == 0) {
                cCounter++;
            } else if (input.equals("o") && oCounter == 0) {
                oCounter++;
            } else if (input.equals("n") && nCounter == 0) {
                nCounter++;
            } else if (!input.matches("[a-zA-Z]")) {
            } else {
                char letter = input.charAt(0);
                word = word + letter;
            }

            if (cCounter == 1 && oCounter == 1 && nCounter == 1) {
                word = word + " ";
                cCounter = 0;
                oCounter = 0;
                nCounter = 0;
                }

            input = scanner.nextLine();
            }

            if (cCounter + oCounter + nCounter < 3 && word.contains(" ")) {
                word = word.substring(0, word.lastIndexOf(" "));
            }

                System.out.println(word + " ");
    }
}