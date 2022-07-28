package midexam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheAngryCat_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> itemsList = Arrays.stream(scanner.nextLine().split(", "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        int entryPoint = Integer.parseInt(scanner.nextLine());
        String typeOfItem = scanner.nextLine();

        List<Integer> leftItemsList = itemsList.subList(0, entryPoint);
        int leftItemsSum = 0;
        if (typeOfItem.equals("cheap")) {
            for (int item : leftItemsList) {
                if (item < itemsList.get(entryPoint)) {
                    leftItemsSum += item;
                }
            }
        } else {
            for (int item : leftItemsList) {
                if (item >= itemsList.get(entryPoint)) {
                    leftItemsSum += item;
                }
            }
        }

        List<Integer> rightItemsList = itemsList.subList(entryPoint + 1, itemsList.size());
        int rightItemsSum = 0;
        if (typeOfItem.equals("cheap")) {
            for (int item : rightItemsList) {
                if (item < itemsList.get(entryPoint)) {
                    rightItemsSum += item;
                }
            }
        } else {
            for (int item : rightItemsList) {
                if (item >= itemsList.get(entryPoint)) {
                    rightItemsSum += item;
                }
            }
        }

        if (leftItemsSum >= rightItemsSum) {
            System.out.printf("Left - %d", leftItemsSum);
        } else {
            System.out.printf("Right - %d", rightItemsSum);
        }
    }
}