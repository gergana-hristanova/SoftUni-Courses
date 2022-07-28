package mapslambdaandstreamAPI_07;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResults_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Integer>> resultsMap = new LinkedHashMap<>();

        String[] inputLine = scanner.nextLine().split("-");
        while (!inputLine[0].equals("exam finished")) {
            String username = inputLine[0];

            if (!inputLine[1].equals("banned")) {
                String language = inputLine[1];
                int points = Integer.parseInt(inputLine[2]);

                resultsMap.putIfAbsent(language, new LinkedHashMap<>());
                resultsMap.get(language).putIfAbsent(username, 0);

                if (points > resultsMap.get(language).get(username)) {
                    if (resultsMap.get(language).get(username) != 0) {
                        resultsMap.get(language).put(String.valueOf(points), 404);
                    }
                    resultsMap.get(language).put(username, points);

                } else {
                    resultsMap.get(language).put(String.valueOf(points), 404);
                }
            } else {
                resultsMap.entrySet().stream().forEach(entry1 -> {
                    entry1.getValue().entrySet().stream()
                    .forEach(entry2 -> {
                        if(username.equals(entry2.getKey())) {
                            entry1.getValue().put(username, 404);
                        }
                    });
                });
            }

            inputLine = scanner.nextLine().split("-");
        }

        System.out.println("Results:");
        resultsMap.entrySet().stream().forEach(entry1 ->
                entry1.getValue().entrySet().stream().forEach(entry2 -> {
            if (entry2.getValue() != 404) {
                System.out.printf("%s | %d%n", entry2.getKey(), entry2.getValue());
            }
        }));

        System.out.println("Submissions:");
        resultsMap.entrySet().stream().forEach(entry -> {
            System.out.printf("%s - %d%n", entry.getKey(), entry.getValue().size());
        });
    }
}