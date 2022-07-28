package mapslambdaandstreamAPI_07;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String text = scanner.nextLine();

        Map<Character, Integer> symbolsCount = new LinkedHashMap<>();
        for (char symbol : text.toCharArray()) {
            if (symbol == ' ') {
                continue;
            }

            symbolsCount.putIfAbsent(symbol, 0);
            symbolsCount.put(symbol, symbolsCount.get(symbol) + 1);
        }

        for (Map.Entry<Character, Integer> entry : symbolsCount.entrySet()) {
            System.out.printf("%c -> %d%n", entry.getKey(), entry.getValue());
        }

        /* alternate code:
        symbolsCount.entrySet().forEach(entry ->
                System.out.println(entry.getKey() + " -> " + entry.getValue()));*/
    }
}