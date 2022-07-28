package lists_05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        int sizeList = numList.size();
        for (int i = 0; i < sizeList / 2; i++) {
            int firstNum = numList.get(i);
            int secondNum = numList.get(sizeList - 1 - i);

            numList.set(i, firstNum + secondNum);
            numList.remove(numList.size() - 1);
        }

        System.out.println(numList.toString().replaceAll("[\\[\\],]", ""));
    }
}