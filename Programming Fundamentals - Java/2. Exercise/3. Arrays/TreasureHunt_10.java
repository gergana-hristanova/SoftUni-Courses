package arrays_03;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TreasureHunt_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> treasureChest = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        List<String> commandList = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        while(!commandList.get(0).equals("Yohoho!")) {

            String command = commandList.get(0);
            switch(command) {
                case "Loot":
                    for (int i = 1; i < commandList.size(); i++) {
                        String currentLoot = commandList.get(i);
                        if (!treasureChest.contains(currentLoot)) {
                            treasureChest.add(0, currentLoot);
                        }
                    }
                    break;

                case "Drop":
                    int index = Integer.parseInt(commandList.get(1));
                    if (index > 0 && index < treasureChest.size()) {
                        treasureChest.add(treasureChest.get(index));
                        treasureChest.remove(index);
                    }
                    break;

                case "Steal":
                    int count = Integer.parseInt(commandList.get(1));
                    if (count > treasureChest.size()) {
                        treasureChest.clear();
                    } else {
                        for (int i = treasureChest.size() - count; i < treasureChest.size(); i++) {
                            System.out.print(treasureChest.get(i));
                            if (i != treasureChest.size() - 1) {
                                System.out.print(", ");
                            }
                        }
                        System.out.println();
                        treasureChest = treasureChest.subList(0, treasureChest.size() - count);
                    }
                    break;
            }

            commandList = Arrays.stream(scanner.nextLine().split(" "))
                    .collect(Collectors.toList());
        }

        if (!treasureChest.isEmpty()) {
            int lootCharactersSum = 0;
            for (String currentLoot : treasureChest) {
                lootCharactersSum += currentLoot.length();
            }

            System.out.printf("Average treasure gain: %.2f pirate credits.",
                    lootCharactersSum * 1.0 / treasureChest.size());
        } else {
            System.out.println("Failed treasure hunt.");
        }
    }
}