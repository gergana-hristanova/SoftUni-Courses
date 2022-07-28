package mapslambdaandstreamAPI_07;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double[]> ordersMap = new LinkedHashMap<>();

        String[] inputArray = scanner.nextLine().split(" ");
        while (!inputArray[0].equals("buy")) {
            String name = inputArray[0];
            double price = Double.parseDouble(inputArray[1]);
            double quantity = Double.parseDouble(inputArray[2]);

            if (!ordersMap.containsKey(name)) {
                ordersMap.put(name, new Double[2]);
                ordersMap.get(name)[0] = price;
                ordersMap.get(name)[1] = quantity;
            } else {
                ordersMap.get(name)[0] = price;
                ordersMap.get(name)[1] += quantity;
            }

            inputArray = scanner.nextLine().split(" ");
        }

        for (Map.Entry<String, Double[]> entry : ordersMap.entrySet()) {
            String name = entry.getKey();
            double price = entry.getValue()[0] * entry.getValue()[1];
            System.out.printf("%s -> %.2f%n", name, price);
        }
    }
}