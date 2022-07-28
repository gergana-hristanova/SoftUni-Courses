package textprocessing_08;

import java.util.Scanner;

public class StringExplosion_07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder text = new StringBuilder(scanner.nextLine());

        int totalStrength = 0;
        for (int position = 0; position < text.length(); position++) {
            char currentSymbol = text.charAt(position);
            if (currentSymbol == '>') {
                int explosionStrength = Integer.parseInt(text.charAt(position + 1) + "");
                totalStrength += explosionStrength;
            } else if (currentSymbol != '>' && totalStrength > 0) {
                text.deleteCharAt(position);
                totalStrength--;
                position--;
            }
        }

        System.out.println(text);
    }
}
