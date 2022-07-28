package mapslambdaandstreamAPI_07;

import java.util.*;

public class CompanyUsers_08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> companiesMap = new LinkedHashMap<>();

        String[] inputLine = scanner.nextLine().split(" -> ");
        while (!inputLine[0].equals("End")) {
            String companyName = inputLine[0];
            String employeeId = inputLine[1];

            companiesMap.putIfAbsent(companyName, new ArrayList<>());

            if (!companiesMap.get(companyName).contains(employeeId)) {
                companiesMap.get(companyName).add(employeeId);
            }

            inputLine = scanner.nextLine().split(" -> ");
        }

        for (Map.Entry<String, List<String>> entry : companiesMap.entrySet()) {
            System.out.printf("%s%n", entry.getKey());
            for (String employeeId : entry.getValue()) {
                System.out.println("-- " + employeeId);
            }
        }
    }
}