package midexampreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targetsList = Arrays.stream(scanner.nextLine().split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] commandLine = input.split(" ");
            String command = commandLine[0];
            int index = Integer.parseInt(commandLine[1]);
            int value = Integer.parseInt(commandLine[2]);

            switch (command) {
                case "Shoot":
                    if (indexIsValid(index, targetsList)) {
                        targetsList.set(index, targetsList.get(index) - value);

                        if (targetsList.get(index) <= 0) {
                            targetsList.remove(index);
                        }
                    }
                    break;

                case "Add":
                    if (indexIsValid(index, targetsList)) {
                        targetsList.add(index, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;

                case "Strike":
                    boolean validIndexRadius = index + value < targetsList.size()
                            && index - value >= 0;
                    if (validIndexRadius) {
                        int radius = value * 2 + 1;
                        for (int i = 0; i < radius; i++) {
                            targetsList.remove(index - value);
                        }
                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        List<String> resultList = new ArrayList<>();
        for (int target : targetsList) {
            resultList.add(String.valueOf(target));
        }
        System.out.println(String.join("|", resultList));
    }

    public static boolean indexIsValid(int index, List<Integer> list) {
        return index >= 0 && index < list.size();
    }
}