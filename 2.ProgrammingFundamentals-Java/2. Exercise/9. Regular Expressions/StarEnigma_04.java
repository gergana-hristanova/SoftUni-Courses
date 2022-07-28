package regularexpressions_09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countMessages = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile("@(?<planetName>[A-Za-z]+)[^@!:>-]*:(?<population>\\d+)[^@!:>-]*!(?<attackType>[AD])![^@!:>-]*->(?<soldiersCount>\\d+)");
        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();

        for (int i = 1; i <= countMessages; i++) {
            String encryptedMessage = scanner.nextLine();
            String decryptedMessage = getDecryptedMessage(encryptedMessage);

            Matcher matcher = pattern.matcher(decryptedMessage);

            if (matcher.find()) {
                String planetName = matcher.group("planetName");
                //int planetPopulation = Integer.parseInt(matcher.group("population"));
                String attackType = matcher.group("attackType");
                //int soldiersCount = Integer.parseInt(matcher.group("soldiersCount"));

                if (attackType.equals("A")) {
                    attackedPlanets.add(planetName);
                } else {
                    destroyedPlanets.add(planetName);
                }
            }
        }

        System.out.println("Attacked planets: " + attackedPlanets.size());
        Collections.sort(attackedPlanets);
        attackedPlanets.forEach(planet -> System.out.println("-> " + planet));

        System.out.println("Destroyed planets: " + destroyedPlanets.size());
        Collections.sort(destroyedPlanets);
        destroyedPlanets.forEach(planet -> System.out.println("-> " + planet));
    }

    private static String getDecryptedMessage(String encryptedMessage) {
        int countSpecialLetters = getSpecialLettersCount(encryptedMessage);

        StringBuilder decryptedMessage = new StringBuilder();
        for (char symbol : encryptedMessage.toCharArray()) {
            char decryptedSymbol = (char) (symbol - countSpecialLetters);
            decryptedMessage.append(decryptedSymbol);
        }

        return decryptedMessage.toString();
    }

    private static int getSpecialLettersCount(String encryptedMessage) {
        int count = 0;
        for (char symbol : encryptedMessage.toCharArray()) {
            switch (symbol) {
                case 's':
                case 't':
                case 'a':
                case 'r':
                case 'S':
                case 'T':
                case 'A':
                case 'R':
                    count++;
                    break;
            }
        }

        return  count;
    }
}
