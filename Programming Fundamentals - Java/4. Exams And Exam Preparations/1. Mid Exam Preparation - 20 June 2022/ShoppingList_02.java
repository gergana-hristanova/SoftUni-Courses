package midexampreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> shoppingList = Arrays.stream(scanner.nextLine().split("!"))
                .collect(Collectors.toList());

        String[] commandLine = scanner.nextLine().split(" ");
        while (!commandLine[0].equals("Go")) {
            String command = commandLine[0];
            String currentItem = commandLine[1];

            switch (command) {
                case "Urgent":
                    if (!itemExists(currentItem, shoppingList)) {
                        shoppingList.add(0, currentItem);
                    }
                    break;

                case "Unnecessary":
                    if (itemExists(currentItem, shoppingList)) {
                        shoppingList.remove(currentItem);
                    }
                    break;

                case "Correct":
                    String newItem = commandLine[2];
                    if (itemExists(currentItem, shoppingList)) {
                        for (int i = 0; i < shoppingList.size(); i++) {
                            if (shoppingList.get(i).equals(currentItem)) {
                                shoppingList.set(i, newItem);
                            }
                        }
                    }
                    break;

                case "Rearrange":
                    if (itemExists(currentItem, shoppingList)) {
                        shoppingList.remove(currentItem);
                        shoppingList.add(currentItem);
                    }
                    break;
            }

            commandLine = scanner.nextLine().split(" ");
        }

        System.out.println(String.join(", ", shoppingList));
    }

    private static boolean itemExists(String item, List<String> list) {
        return list.contains(item);
    }
}