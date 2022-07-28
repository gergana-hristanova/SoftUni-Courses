package regularexpressions_09;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] racersArr = scanner.nextLine().split(", ");
        Map<String, Integer> racersMap = new LinkedHashMap<>();
        for (String racerName : racersArr) {
            racersMap.put(racerName, 0);
        }

        Pattern lettersPattern = Pattern.compile("[A-Za-z]+");
        Pattern digitsPattern = Pattern.compile("\\d");

        String input = scanner.nextLine();
        while (!input.equals("end of race")) {

            String racerName = "";
            Matcher lettersMatcher = lettersPattern.matcher(input);
            while (lettersMatcher.find()) {
                racerName = racerName.concat(lettersMatcher.group());
            }

            if (racersMap.containsKey(racerName)) {

            int distanceRan = 0;
            Matcher digitsMatcher = digitsPattern.matcher(input);
            while (digitsMatcher.find()) {
                distanceRan += Integer.parseInt(digitsMatcher.group());
            }
                racersMap.put(racerName, racersMap.get(racerName) + distanceRan);
            }

            input = scanner.nextLine();
        }

        List<String> winnersList = racersMap.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                                .limit(3).map(Map.Entry::getKey)
                        .collect(Collectors.toList());

        System.out.printf("1st place: %s%n", winnersList.get(0));
        System.out.printf("2nd place: %s%n", winnersList.get(1));
        System.out.printf("3rd place: %s%n", winnersList.get(2));
    }
}