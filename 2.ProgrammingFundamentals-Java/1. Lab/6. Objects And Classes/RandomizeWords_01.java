package objectsandclasses_06;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;


public class RandomizeWords_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> wordsList = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        while (!wordsList.isEmpty()) {
            Random rnd = new Random(); //bound is exclusive ⬇️
            int randomIndex = rnd.nextInt(wordsList.size());

            String word = wordsList.get(randomIndex);

            System.out.println(word);
            wordsList.remove(randomIndex);
        }
    }
}