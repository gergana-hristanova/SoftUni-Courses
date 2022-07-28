package lists_05;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse_07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        list.removeIf(e -> e < 0);

        if (list.isEmpty()) {
            System.out.println("empty");
        } else {
            Collections.reverse(list);
            System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}