package FinalExamRetake_01;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("([#\\|])(?<itemName>[A-Za-z\\s]+)\\1(?<expirationDate>\\d{2}\\/\\d{2}\\/\\d{2})\\1(?<calories>\\d+)\\1");
        Matcher matcher = pattern.matcher(input);

        List<String> foodNamesList = new ArrayList<>();
        List<String> foodExpirationDatesList = new ArrayList<>();
        List<Integer> foodCaloriesList = new ArrayList<>();
        int totalCalories = 0;

        while (matcher.find()) {
            String itemName = matcher.group("itemName");
            String expirationDate = matcher.group("expirationDate");
            int calories = Integer.parseInt(matcher.group("calories"));

            foodNamesList.add(itemName);
            foodExpirationDatesList.add(expirationDate);
            foodCaloriesList.add(calories);

            totalCalories += calories;
        }

        System.out.printf("You have food to last you for: %d days!%n", totalCalories / 2000);

        for (int i = 0; i < foodNamesList.size(); i ++) {
            String itemName = foodNamesList.get(i);
            String itemExpirationDate = foodExpirationDatesList.get(i);
            int itemCalories = foodCaloriesList.get(i);

            System.out.printf("Item: %s, Best before: %s, Nutrition: %d%n",
                    itemName, itemExpirationDate, itemCalories);
        }
    }
}