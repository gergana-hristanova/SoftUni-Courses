package mapslambdaandstreamapi_07;

import java.util.*;

public class OddOccurrences_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsList = scanner.nextLine().split(" ");
        Map<String, Integer> wordsCountsMap = new LinkedHashMap<>();

        for (String currentWord : wordsList) {
            currentWord = currentWord.toLowerCase();

            wordsCountsMap.putIfAbsent(currentWord, 0);
            wordsCountsMap.put(currentWord,wordsCountsMap.get(currentWord) + 1);
        }

        List<String> outputList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordsCountsMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                outputList.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ", outputList));
    }
}