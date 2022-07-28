package objectsandclasses_06;

import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] phrasesArr = new String[] {
                "Excellent product.",
                "Such a great product.",
                "I always use that product.",
                "Best product of its category.",
                "Exceptional product.",
                "I can't live without this product."};

        String[] eventsArr = new String[] {
                "Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.",
                "I feel great!"};

        String[] authorsArr = new String[] {
                "Diana",
                "Petya",
                "Stella",
                "Elena",
                "Katya",
                "Iva",
                "Annie",
                "Eva"};

        String[] citiesArr = new String[] {
                "Burgas",
                "Sofia",
                "Plovdiv",
                "Varna",
                "Ruse"};

        Random rnd = new Random();

        int numberOfMessages = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfMessages; i++) {
            int phraseIndex = rnd.nextInt(phrasesArr.length);
            int eventIndex = rnd.nextInt(eventsArr.length);
            int authorIndex = rnd.nextInt(authorsArr.length);
            int cityIndex = rnd.nextInt(citiesArr.length);

            System.out.printf("%s %s %s - %s%n",
                    phrasesArr[phraseIndex],
                    eventsArr[eventIndex],
                    authorsArr[authorIndex],
                    citiesArr[cityIndex]);
        }
    }
}