package regularexpressions_09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile(">>(?<name>[A-Za-z]+)<<(?<price>\\d+\\.?\\d*)!(?<quantity>\\d+)");
        double totalSum = 0;
        List<String> furnitureList = new ArrayList<>();

        String input = scanner.nextLine();
        while(!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String furnitureName = matcher.group("name");
                double furniturePrice = Double.parseDouble(matcher.group("price"));
                int furnitureQuantity = Integer.parseInt(matcher.group("quantity"));

                furnitureList.add(furnitureName);
                totalSum += furniturePrice * furnitureQuantity;
            }

            input = scanner.nextLine();
        }

        System.out.println("Bought furniture:");
        for (String furnitureName : furnitureList) {
            System.out.println(furnitureName);
        }

        System.out.printf("Total money spend: %.2f", totalSum);
    }
}