package lists_05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagonsList = Arrays.stream(scanner.nextLine().split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        int wagonMaxCapacity = Integer.parseInt(scanner.nextLine());

        List<String> commandList = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());
        while(!commandList.get(0).equals("end")) {
            String command = commandList.get(0);
            if (command.equals("Add")) {
                int wagonToAdd = Integer.parseInt(commandList.get(1));
                wagonsList.add(wagonToAdd);
            } else {
                int passengerToAdd = Integer.parseInt(commandList.get(0));
                for (int i = 0; i < wagonsList.size(); i++) {
                    if (passengerToAdd <= wagonMaxCapacity - wagonsList.get(i)) {
                        wagonsList.set(i, wagonsList.get(i) + passengerToAdd);
                        break;
                    }
                }
            }

            commandList = Arrays.stream(scanner.nextLine().split(" "))
                    .collect(Collectors.toList());
        }

        System.out.println(wagonsList.toString()
                .replaceAll("[\\[\\],]", ""));
    }
}