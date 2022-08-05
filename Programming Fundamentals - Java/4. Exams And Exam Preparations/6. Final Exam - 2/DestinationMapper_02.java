package final_exam_retake_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("([=/])(?<location>[A-Z][A-Za-z]{2}[A-Za-z]*)\\1");
        Matcher matcher = pattern.matcher(input);

        List<String> locationsList = new ArrayList<>();
        while (matcher.find()) {
            locationsList.add(matcher.group("location"));
        }

        int travelPoints = 0;
        for (String location : locationsList) {
            for (char ignored : location.toCharArray()) {
                travelPoints++;
            }
        }

        System.out.println("Destinations: " + String.join(", ", locationsList));
        System.out.printf("Travel Points: %d%n", travelPoints);
    }
}