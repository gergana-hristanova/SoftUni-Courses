package midexam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CoffeeLover_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> coffeeList = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        int numberOfCommands = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= numberOfCommands; i++) {
            String[] commandLine = scanner.nextLine().split(" ");
            String command = commandLine[0];

            switch (command) {
                case "Include":
                    coffeeList.add(commandLine[1]);
                    break;

                case "Remove":
                    int numberOfCoffees = Integer.parseInt(commandLine[2]);

                    if (numberOfCoffees <= coffeeList.size()) {
                        if (commandLine[1].equals("first")) {
                            coffeeList.subList(0, numberOfCoffees).clear();
                        } else {
                            coffeeList.subList(coffeeList.size() - numberOfCoffees, coffeeList.size()).clear();
                        }
                    }
                    break;

                case "Prefer":
                    int firstIndex = Integer.parseInt(commandLine[1]);
                    int secondIndex = Integer.parseInt(commandLine[2]);

                    if (indexesAreValid(firstIndex, secondIndex, coffeeList)) {
                        String firstCoffee = coffeeList.get(firstIndex);
                        String secondCoffee = coffeeList.get(secondIndex);
                        coffeeList.set(firstIndex, secondCoffee);
                        coffeeList.set(secondIndex, firstCoffee);
                    }
                    break;

                case "Reverse":
                    Collections.reverse(coffeeList);
                    break;
            }
        }

        System.out.println("Coffees:");
        System.out.println(String.join(" ", coffeeList));
    }

    private static boolean indexesAreValid(int index1, int index2, List<String> list) {
        return (0 <= index1 && index1 < list.size()) && (0 <= index2 && index2 < list.size());
    }
}