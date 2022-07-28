package lists_05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays.stream(scanner.nextLine().split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            //Add
            if (command.contains("Add")) {
                int number = Integer.parseInt(command.split(" ")[1]);
                numberList.add(number);
            //Insert
            } else if (command.contains("Insert")) {
                int index = Integer.parseInt(command.split(" ")[2]);
                if (indexIsValid(index, numberList)) {
                    int number = Integer.parseInt(command.split(" ")[1]);
                    numberList.add(index, number);
                } else {
                    System.out.println("Invalid index");
                }
            //Remove
            } else if (command.contains("Remove")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                if (indexIsValid(index, numberList)) {
                    numberList.remove(index);
                } else {
                    System.out.println("Invalid index");
                }
            //Shift left
            } else if (command.contains("Shift left")) {
                int count = Integer.parseInt(command.split(" ")[2]);
                for (int i = 0; i < count; i++) {
                    numberList.add(numberList.get(0));
                    numberList.remove(0);
                }
            //Shift right
            } else if (command.contains("Shift right")) {
                int count = Integer.parseInt(command.split(" ")[2]);
                for (int i = 0; i < count; i++) {
                    numberList.add(0, numberList.get(numberList.size() - 1));
                    numberList.remove(numberList.size() - 1);
                }
            }

            command = scanner.nextLine();
        }

        System.out.println(numberList.toString()
                .replaceAll("[\\[\\],]", ""));
    }

    private static boolean indexIsValid(int index, List<Integer> list) {
        return index >= 0 && index < list.size();
    }
}