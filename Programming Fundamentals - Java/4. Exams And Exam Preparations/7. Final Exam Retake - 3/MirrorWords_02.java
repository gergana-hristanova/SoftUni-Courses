package final_exam_retake_03;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("([@#])(?<word1>[A-Za-z]{3}[A-Z-a-z]*)\\1\\1(?<word2>[A-Za-z]{3}[A-Z-a-z]*)\\1");
        Matcher matcher = pattern.matcher(input);

        int wordPairsCount = 0;
        Map<String, String> mirrorWordsMap = new LinkedHashMap<>();
        while (matcher.find()) {
            wordPairsCount++;

            String word1 = matcher.group("word1");

            StringBuilder word2StringBuilder = new StringBuilder(matcher.group("word2"));
            word2StringBuilder.reverse();
            String word2Reversed = word2StringBuilder.toString();

            if (word1.equals(word2Reversed)) {
                mirrorWordsMap.put(word1, word2StringBuilder.reverse().toString());
            }
        }

        if (wordPairsCount > 0) {
            System.out.printf("%d word pairs found!%n", wordPairsCount);
        } else {
            System.out.println("No word pairs found!");
        }

        if (mirrorWordsMap.size() > 0) {
            System.out.println("The mirror words are:");

            int i = 0;
            for (Map.Entry<String, String> entry : mirrorWordsMap.entrySet()) {
                System.out.printf("%s <=> %s", entry.getKey(), entry.getValue());

                i++;
                if (i < mirrorWordsMap.size()) {
                    System.out.print(", ");
                }
            }
        } else {
            System.out.println("No mirror words!");
        }
    }
}
