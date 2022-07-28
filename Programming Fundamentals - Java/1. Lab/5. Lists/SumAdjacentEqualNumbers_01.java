package lists_05;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbersList = Arrays.stream(scanner.nextLine().split(" "))
            .map(Double::parseDouble)
            .collect(Collectors.toList());

        for (int i = 0; i < numbersList.size() - 1; i++) {
            if (numbersList.get(i).equals(numbersList.get(i + 1))) {
                numbersList.set(i, (numbersList.get(i) + numbersList.get(i + 1)));
                numbersList.remove(i + 1);

                i = -1;
            }
        }

        System.out.print(joinElementsByDelimiter(numbersList, " "));

        /*for (Double currentElement : numbersList) {
            System.out.print(new DecimalFormat("0.#").format(currentElement) + " ");
        }*/
    }

    private static String joinElementsByDelimiter(List<Double> list, String delimiter) {
        String result = "";
        for (Double printer : list) {
            DecimalFormat df = new DecimalFormat("0.#");
            String numberFormatted = df.format(printer);
            result += numberFormatted + delimiter;
        }
        return result;
    }
}