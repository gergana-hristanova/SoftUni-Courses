package final_exam_retake_02;

import java.util.*;

public class PlantDiscovery_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> rarityMap = new LinkedHashMap<>();
        Map<String, List<Double>> ratingsMap = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] plantInfo = scanner.nextLine().split("<->");
            String plantName = plantInfo[0];
            Double plantRarity = Double.valueOf(plantInfo[1]);

            rarityMap.put(plantName, plantRarity);

            ratingsMap.put(plantName, new ArrayList<>());
        }

        String[] commandLine = scanner.nextLine().split(" ");
        while (!commandLine[0].equals("Exhibition")) {

            String command = commandLine[0];
            String plant = commandLine[1];

            if (!rarityMap.containsKey(plant)) {
                System.out.println("error");

                commandLine = scanner.nextLine().split(" ");
                continue;
            }

            switch (command) {
                case "Rate:":
                    double newRating = Double.parseDouble(commandLine[3]);

                    ratingsMap.get(plant).add(newRating);
                    break;

                case "Update:":
                    double newRarity = Double.parseDouble(commandLine[3]);

                    rarityMap.put(plant, newRarity);
                    break;

                case "Reset:":
                    ratingsMap.get(plant).clear();
                    break;
            }

            commandLine = scanner.nextLine().split(" ");
        }

        System.out.println("Plants for the exhibition:");

        for (Map.Entry<String, Double> rarityEntry : rarityMap.entrySet()) {
            String plantName = rarityEntry.getKey();
            Double plantRarity = rarityEntry.getValue();

            List<Double> plantRatingsList = ratingsMap.get(plantName);
            Double averagePlantRating = 0.0;

            if (ratingsMap.get(plantName).isEmpty()) {
                averagePlantRating = 0.0;
            } else {
                for (Double rating : plantRatingsList) {
                    averagePlantRating += rating;
                }
                averagePlantRating /= plantRatingsList.size();
            }

            System.out.printf("- %s; Rarity: %.0f; Rating: %.2f%n", plantName, plantRarity, averagePlantRating);
        }
    }
}
