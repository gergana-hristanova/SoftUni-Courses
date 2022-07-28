import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MMMMM {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> nameAndPoints = new LinkedHashMap<>();
        Map<String, ArrayList<String>> nameAndLanguage = new LinkedHashMap<>();

        String input = "";
        while (!"exam finished".equalsIgnoreCase(input = reader.readLine())) {
            String[] inputArray = input.split("-");

            String name = inputArray[0];
            String language = inputArray[1];

            switch (inputArray[1]) {
                case "banned":
                    nameAndPoints.remove(name);
                    break;
                default:
                    int score = Integer.parseInt(inputArray[2]);

                    if (!nameAndPoints.containsKey(name)) {
                        nameAndPoints.putIfAbsent(name, score);
                    }
                    if (nameAndPoints.containsKey(name) && nameAndPoints.get(name) < score) {
                        nameAndPoints.put(name, score);
                    }

                    if (!nameAndLanguage.containsKey(language)) {
                        nameAndLanguage.put(language, new ArrayList<>());
                    }
                    nameAndLanguage.get(language).add(name);
                    break;
            }
        }
        System.out.println("Results:");
        nameAndPoints.entrySet().stream().forEach(e -> {
            System.out.println(String.format("%s | %d", e.getKey(), e.getValue()));
        });

        System.out.println("Submissions:");
        nameAndLanguage.entrySet().stream().forEach(kvp -> {
            System.out.println(String.format("%s - %d", kvp.getKey(), kvp.getValue().size()));
        });
    }
}