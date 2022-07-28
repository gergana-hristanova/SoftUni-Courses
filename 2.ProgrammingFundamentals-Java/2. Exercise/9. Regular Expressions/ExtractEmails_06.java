package regularexpressions_09;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails_06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile("([A-Za-z0-9]+[._-]?[A-Za-z0-9]+)@([A-Za-z]+-?[A-Za-z]+)(\\.([A-Za-z]+-?[A-Za-z]))+");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}