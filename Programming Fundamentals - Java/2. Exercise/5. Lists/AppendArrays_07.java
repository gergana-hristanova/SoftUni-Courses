package lists_05;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays_07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> arrays = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        Collections.reverse(arrays);
        String toPrint = arrays.toString().replaceAll("[\\[\\],]", "");
        toPrint = toPrint.replaceAll("\\s+", " ").trim();

        System.out.println(toPrint);
    }
}