package regularexpressions_09;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("(?<day>\\d{2})([-./])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println("Day: " + matcher.group("day") +
                    ", " + "Month: " + matcher.group("month") +
                    ", " + "Year: " + matcher.group("year"));
        }
    }
}