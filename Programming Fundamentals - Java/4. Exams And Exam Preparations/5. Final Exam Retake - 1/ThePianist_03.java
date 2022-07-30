package FinalExamRetake_01;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ThePianist_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int numberOfPieces = Integer.parseInt(scanner.nextLine());

        Map<String, String[]> piecesMap = new LinkedHashMap<>();

        for (int i = 0; i < numberOfPieces; i++) {
            String[] input = scanner.nextLine().split("\\|");
            String piece = input[0];
            String composer = input[1];
            String key = input[2];

            String[] value = new String[2];
            value[0] = composer;
            value[1] = key;

            piecesMap.put(piece, value);
        }

        String commandLine = scanner.nextLine();
        while (!commandLine.equals("Stop")) {
            String[] commandArr = commandLine.split("\\|");

            String command = commandArr[0];
            String piece = commandArr[1];
            switch (command) {
                case "Add":

                    if (!piecesMap.containsKey(piece)) {
                        String[] value = new String[2];
                        String composer = commandArr[2];
                        String key = commandArr[3];
                        value[0] = composer;
                        value[1] = key;

                        piecesMap.put(piece, value);
                        System.out.printf("%s by %s in %s added to the collection!%n",
                                piece, composer, key);
                    } else {
                        System.out.printf("%s is already in the collection!%n", piece);
                    }
                    break;

                case "Remove":
                    if (piecesMap.containsKey(piece)) {
                        piecesMap.remove(piece);
                        System.out.printf("Successfully removed %s!%n", piece);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    }
                    break;

                case "ChangeKey":
                    if (piecesMap.containsKey(piece)) {
                        String newKey = commandArr[2];
                        piecesMap.get(piece)[1] = newKey;
                        System.out.printf("Changed the key of %s to %s!%n", piece, newKey);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    }
                    break;
            }

            commandLine = scanner.nextLine();
        }

        for (Map.Entry<String, String[]> entry : piecesMap.entrySet()) {
            String piece = entry.getKey();
            String composer = entry.getValue()[0];
            String key = entry.getValue()[1];

            System.out.printf("%s -> Composer: %s, Key: %s%n",
                    piece, composer, key);
        }
    }
}