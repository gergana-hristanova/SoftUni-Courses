package lists_05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numsList = Arrays.stream(scanner.nextLine().split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        List<String> commandList = Arrays.stream(scanner.nextLine().split(" "))
            .collect(Collectors.toList());

        while (!commandList.get(0).equals("end")) {
            String command = commandList.get(0);
            int number = Integer.parseInt(commandList.get(1));

            switch (command) {
                case "Add":
                    numsList.add(number);
                    break;
                case "Remove":
                    numsList.remove(Integer.valueOf(number));
                    break;
                case "RemoveAt":
                    numsList.remove(number);
                    break;
                case "Insert":
                    int index = Integer.parseInt(commandList.get(2));
                    numsList.add(index, number);
            }

            commandList = Arrays.stream(scanner.nextLine().split(" "))
                    .collect(Collectors.toList());
        }

        System.out.println(numsList.toString().replaceAll("[\\[\\],]", ""));
    }
}