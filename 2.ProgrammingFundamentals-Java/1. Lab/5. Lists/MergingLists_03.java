package lists_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int minListSize = Math.min(firstList.size(), secondList.size());

        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < minListSize; i++) {
            resultList.add(firstList.get(i));
            resultList.add(secondList.get(i));
        }

        if (firstList.size() > secondList.size()) {
            resultList.addAll(firstList.subList(minListSize, firstList.size()));
        } else {
            resultList.addAll(secondList.subList(minListSize, secondList.size()));
        }

        System.out.println(resultList.toString()
                .replace("[", "")
                .replace("]", "")
                .replace(",", ""));
    }
}