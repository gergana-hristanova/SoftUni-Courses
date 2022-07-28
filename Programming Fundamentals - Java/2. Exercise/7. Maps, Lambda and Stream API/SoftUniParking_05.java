package mapslambdaandstreamAPI_07;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> registrationsMap = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] commandLine = scanner.nextLine().split(" ");
            String command = commandLine[0];
            String username = commandLine[1];
            switch (command) {
                case "register":
                    String licencePlateNumber = commandLine[2];

                    if (!registrationsMap.containsKey(username)) {
                        registrationsMap.put(username, licencePlateNumber);
                        System.out.printf("%s registered %s successfully%n", username, licencePlateNumber);
                    } else {
                        System.out.printf("ERROR: already registered with plate number %s%n",
                                registrationsMap.get(username));
                    }
                    break;

                case "unregister":
                    if (registrationsMap.containsKey(username)) {
                        System.out.printf("%s unregistered successfully%n", username);
                        registrationsMap.remove(username);
                    } else {
                        System.out.printf("ERROR: user %s not found%n", username);
                    }
                    break;
            }
        }

        for (Map.Entry<String, String> entry : registrationsMap.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }
    }
}