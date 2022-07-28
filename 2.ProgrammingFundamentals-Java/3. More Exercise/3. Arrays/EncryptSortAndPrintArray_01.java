package Arrays_03;

import java.util.*;

public class EncryptSortAndPrintArray_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfString = Integer.parseInt(scanner.nextLine());
        List<Integer> numberSequence = new ArrayList<>();

        for (int i = 0; i < numberOfString; i++) {
            String string = scanner.nextLine();
            int stringSum = 0;

            for (int j = 0; j < string.length(); j++) {
                int charSum = 0;
                char currentChar = string.charAt(j);
                if (isVowel(currentChar)) {
                    charSum = currentChar * string.length();
                } else {
                    charSum = currentChar / string.length();
                }
                stringSum += charSum;
            }

            numberSequence.add(stringSum);
        }

        Collections.sort(numberSequence);
        for (Integer number : numberSequence) {
            System.out.println(number);
        }
    }

    private static boolean isVowel(char charr) {
        return  (charr == 'a') ||
                (charr == 'e') ||
                (charr == 'i') ||
                (charr == 'o') ||
                (charr == 'u') ||
                (charr == 'A') ||
                (charr == 'E') ||
                (charr == 'I') ||
                (charr == 'O') ||
                (charr == 'U');
    }
}