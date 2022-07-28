package midexampreparation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Numbers_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integersList = Arrays.stream(scanner.nextLine().split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        Collections.sort(integersList);
        Collections.reverse(integersList);

        double integersSum = 0;
        for (int number : integersList) {
            integersSum += number;
        }
        double averageValue = integersSum / integersList.size();

        byte counter = 5;
        boolean noGreaterThanAverage = true;
        for (int number : integersList) {
            if (number > averageValue) {
                System.out.printf("%d ", number);
                noGreaterThanAverage = false;
                counter--;
            }

            if (counter == 0) {
                break;
            }
        }

        if (noGreaterThanAverage) {
            System.out.println("No");
        }
    }
}