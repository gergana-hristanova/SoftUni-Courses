package lists_05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame_06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (!firstList.isEmpty() && !secondList.isEmpty()) {

            int firstCard = firstList.get(0);
            int secondCard = secondList.get(0);
            if (firstCard > secondCard) {
                firstList.remove(0);
                firstList.add(firstCard);
                firstList.add(secondCard);
                secondList.remove(0);
            } else if (secondCard > firstCard) {
                secondList.remove(0);
                secondList.add(secondCard);
                secondList.add(firstCard);
                firstList.remove(0);
            } else {
                firstList.remove(0);
                secondList.remove(0);
            }
        }

        int sum = 0;
        if (firstList.isEmpty()) {
            System.out.print("Second player wins! ");
            for (int number : secondList) {
                sum += number;
            }
        } else {
            System.out.print("First player wins! ");
            for (int number : firstList) {
                sum += number;
            }
        }

        System.out.println("Sum: " + sum);
    }
}