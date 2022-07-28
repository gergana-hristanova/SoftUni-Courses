package mapslambdaandstreamAPI_07;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int shards = 0;
        int fragments = 0;
        int motes = 0;

        Map<String, Integer> junkMap = new LinkedHashMap<>();

        boolean stopWhileLoop = false;
        while (true) {
            String[] inputLine = scanner.nextLine().split(" ");
            for (int i = 0; i < inputLine.length; i += 2) {
                int quantity = Integer.parseInt(inputLine[i]);
                String material = inputLine[i + 1].toLowerCase();
                switch (material) {
                    case "shards":
                        shards += quantity;
                        break;
                    case "fragments":
                        fragments += quantity;
                        break;
                    case "motes":
                        motes += quantity;
                        break;

                    default:
                        junkMap.putIfAbsent(material, 0);
                        junkMap.put(material, junkMap.get(material) + quantity);
                }

                if (legendaryItemObtained(shards, fragments, motes)) {
                    stopWhileLoop = true;
                    break;
                }
            }

            if (stopWhileLoop) {
                for (Map.Entry<String, Integer> entry : junkMap.entrySet()) {
                    System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
                }

                break;
            }
        }
    }

    private static boolean legendaryItemObtained(int shards, int fragments, int motes) {

        boolean legendaryItemObtained = false;
        if (shards >= 250) {
            System.out.println("Shadowmourne obtained!");
            shards -= 250;
            legendaryItemObtained = true;
        }
        if (fragments >= 250) {
            System.out.println("Valanyr obtained!");
            fragments -= 250;
            legendaryItemObtained = true;
        }
        if (motes >= 250) {
            System.out.println("Dragonwrath obtained!");
            motes -= 250;
            legendaryItemObtained = true;
        }

        if (legendaryItemObtained) {
            System.out.printf("shards: %d%n", shards);
            System.out.printf("fragments: %d%n", fragments);
            System.out.printf("motes: %d%n", motes);

            return true;
        }

        return false;
    }
}