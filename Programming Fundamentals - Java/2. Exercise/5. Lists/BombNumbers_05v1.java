package lists_05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_05v1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        int bombNumber = Integer.parseInt(scanner.next());
        int power = Integer.parseInt(scanner.next());

        for (int i = 0; i < numList.size(); i++) {

            int currentNum = numList.get(i);
            if (currentNum == bombNumber) {
                if (i - 1 < power) {
                    if (numList.size() - i - 1 >= power) {
                        numList.subList(0, i + power + 1).clear();
                    } else {
                        numList.subList(0, numList.size()).clear();
                    }
                } else {
                    if (numList.size() - i - 1 >= power) {
                        numList.subList(i - power, i + power + 1).clear();
                    } else {
                        numList.subList(i - power, numList.size()).clear();
                    }
                }

                if (i >= power) {
                    i -= power - 1;
                } else {
                    i = -1;
                }
            }
        }

        int sum = 0;
        for (int number : numList) {
          sum += number;
        }

        System.out.println(sum);
    }
}

//4 4 6 4 4 4 4 6 4 4 4 4 1
//6 4