package lists_05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_05v2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int bombNumber = Integer.parseInt(scanner.next());
        int power = Integer.parseInt(scanner.next());

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) == bombNumber) {
                if (i - 1 < power) {
                    for (int index = i - power; index <= i + power; index++) {
                        list.set(index, 0);
                    }
                } else {
                    for (int index = 0; index <= i + power; index++) {
                        list.set(index, 0);
                    }
                }
            }
        }

        int sum = 0;
        for (int number: list) {
            sum += number;
        }

        System.out.println(sum);
    }
}