package regularexpressions_09;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern healthCharsPattern = Pattern.compile("[^0-9+\\-*/.]");
        Pattern damageNumsPattern = Pattern.compile("[+-]?\\d+\\.?\\d*");

        String[] namesArr = scanner.nextLine().split("[,\\s]+");
        for (String name : namesArr) {
            int health = 0;
            double damage = 0;

            //health
            Matcher healthCharsMatcher = healthCharsPattern.matcher(name);
            while (healthCharsMatcher.find()) {
                char symbol = healthCharsMatcher.group().charAt(0);
                health += symbol;
            }

            //damage
            Matcher damageNumsMatcher = damageNumsPattern.matcher(name);
            while (damageNumsMatcher.find()) {
                double number = Double.parseDouble(damageNumsMatcher.group());
                damage += number;
            }

            int starsCount = specialSymbolCount('*', name);
            for (int i = 0; i < starsCount; i++) {
                damage *= 2;
            }

            int slashesCount = specialSymbolCount('/', name);
            for (int i = 0; i < slashesCount; i++) {
                damage /= 2;
            }

            System.out.printf("%s - %d health, %.2f damage%n", name, health, damage);
        }
    }

    private static int specialSymbolCount(char specialSymbol, String string) {
        int count = 0;
        for (char symbol : string.toCharArray()) {
            if (symbol == specialSymbol) {
                count++;
            }
        }

        return count;
    }
}