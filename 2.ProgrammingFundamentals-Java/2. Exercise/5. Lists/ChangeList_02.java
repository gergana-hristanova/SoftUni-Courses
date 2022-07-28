package lists_05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputList = Arrays.stream(scanner.nextLine().split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        List<String> commandList = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());
        while(!commandList.get(0).equals("end")) {
            String command = commandList.get(0);
            int element = Integer.parseInt(commandList.get(1));
            switch (command) {
                case "Delete":
                    for (int i = 0; i < inputList.size(); i++) {
                        if (inputList.get(i) == element) {
                            inputList.remove(inputList.get((i)));
                        }
                    }
                    break;
                case "Insert":
                    int position = Integer.parseInt(commandList.get(2));
                    inputList.add(position, element);
                    break;
            }

            commandList = Arrays.stream(scanner.nextLine().split(" "))
                    .collect(Collectors.toList());
        }

        System.out.println(inputList.toString()
                .replaceAll("[\\[\\],]", ""));
    }
}