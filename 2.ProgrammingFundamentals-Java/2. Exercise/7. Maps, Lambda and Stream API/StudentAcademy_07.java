package mapslambdaandstreamAPI_07;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentAcademy_07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> studentsMap = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!studentsMap.containsKey(name)) {
                studentsMap.put(name, grade);
            } else {
                studentsMap.put(name, (studentsMap.get(name) + grade) / 2);
            }
        }

        studentsMap.entrySet().stream().filter(entry -> entry.getValue() >= 4.5).forEach(entry -> {
            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
        });
    }
}