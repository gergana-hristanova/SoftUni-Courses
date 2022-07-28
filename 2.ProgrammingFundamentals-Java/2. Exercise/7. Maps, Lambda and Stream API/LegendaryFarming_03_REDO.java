package mapslambdaandstreamAPI_07;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming_03_REDO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> materials = new LinkedHashMap<>();
        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);

        Map<String, Integer> junk = new LinkedHashMap<>();

        boolean itemObtained = false;
        while (!itemObtained) {

            String[] inputData = scanner.nextLine().split(" ");
            for (int index = 0; index < inputData.length; index += 2) {
                int quantity = Integer.parseInt(inputData[index]);
                String material = inputData[index + 1].toLowerCase();

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    materials.put(material, materials.get(material) + quantity);
                } else {
                    if (!junk.containsKey(material)) {
                        junk.put(material, quantity);
                    }
                }

                if (materials.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    materials.put("shards", materials.get("shards") - 250);
                    itemObtained = true;
                    break;
                }
                if (materials.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    materials.put("fragments", materials.get("fragments") - 250);
                    itemObtained = true;
                    break;
                }
                if (materials.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    materials.put("motes", materials.get("motes") - 250);
                    itemObtained = true;
                    break;
                }
            }
        }

        materials.entrySet().forEach(entry ->
                System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));
        junk.entrySet().forEach(entry ->
                System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));
    }
}