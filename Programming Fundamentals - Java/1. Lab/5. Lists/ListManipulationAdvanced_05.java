package lists_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numsList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<String> commandList = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        while (!commandList.get(0).equals("end")) {
            String command = commandList.get(0);
            String factor = commandList.get(1);

            switch (command) {
                case "Contains":
                    if (numsList.contains(Integer.valueOf(factor))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;

                case "Print":
                    switch (factor) {
                        case "even":
                            for (int element : numsList) {
                                if (element % 2 == 0) {
                                    System.out.print(element + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "odd":
                            for (int element : numsList) {
                                if (element % 2 != 0) {
                                    System.out.print(element + " ");
                                }
                            }
                            System.out.println();
                    }
                    break;

                case "Get":
                    int sum = 0;
                    for (int element : numsList) {
                        sum += element;
                    }
                    System.out.println(sum);
                    break;

                case "Filter":
                    int number = Integer.parseInt(commandList.get(2));
                    List<Integer> outputList = new ArrayList<>();
                    switch(factor) {
                        case "<":
                            outputList.addAll(numsList.stream().filter(element -> element < number)
                                    .collect(Collectors.toList()));
                            break;
                        case "<=":
                            outputList.addAll(numsList.stream().filter(element -> element <= number)
                                    .collect(Collectors.toList()));
                            break;
                        case ">":
                            outputList.addAll(numsList.stream().filter(element -> element > number)
                                    .collect(Collectors.toList()));
                            break;
                        case ">=":
                            outputList.addAll(numsList.stream().filter(element -> element >= number)
                                    .collect(Collectors.toList()));
                    }

                    System.out.println(outputList.toString().replaceAll("[\\[\\],]", ""));
                    break;
            }

            commandList = Arrays.stream(scanner.nextLine().split(" "))
                    .collect(Collectors.toList());
        }
    }
}