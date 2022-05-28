package ConditionalStatementsAdvanced_03;

import java.util.Scanner;

public class PersonalTitles_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //въвеждаме данните
        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();

        //проверяваме пола
        switch (gender) {
            //ако е мъж
            case "m":
                //ако е на 16 или повече години
                if (age >= 16) {
                    System.out.println("Mr.");
                //ако не е на 16
                } else {
                    System.out.println("Master");
                }
                break;
            //ако е жена
            case "f":
                //ако е на 16 или повече години
                if (age >= 16) {
                    System.out.println("Ms.");
                //ако не е на 16
                } else {
                    System.out.println("Miss");
                }
                break;
        }
    }
}