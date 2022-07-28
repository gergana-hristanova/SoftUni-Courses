package mapslambdaandstreamAPI_07;

import java.nio.charset.StandardCharsets;
import java.util.*;

public class Courses_06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> coursesMap = new LinkedHashMap<>();

        String[] inputLine = scanner.nextLine().split(" : ");
        while (!inputLine[0].equals("end")) {
            String courseName = inputLine[0];
            String studentName = inputLine[1];

            if (!coursesMap.containsKey(courseName)) {
                coursesMap.put(courseName, new ArrayList<>());
            }
            coursesMap.get(courseName).add(studentName);

            inputLine = scanner.nextLine().split(" : ");
        }

        for (Map.Entry<String, List<String>> entry : coursesMap.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
            for (String studentName : entry.getValue()) {
                System.out.println("-- " + studentName);
            }
        }
    }
}