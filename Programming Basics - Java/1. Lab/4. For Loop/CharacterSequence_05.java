package ForLoop_04;

import java.util.Scanner;

public class CharacterSequence_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //въвеждаме входния String
        String input = scanner.nextLine();
        //намираме дължината на входния String
        int length = input.length();
        //присвояваме на i 0, понеже първата буква от String-а е на нулева позиция
        //докато i < дължината на String-а
        for (int i = 0; i < length; ++i) {
            //четем буквата на позиция i
            char character = input.charAt(i);
            //извеждаме я
            System.out.println(character);
        }
    }
}