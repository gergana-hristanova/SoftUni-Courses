package DataTypesAndVariables_02;

import java.util.Scanner;

public class PrintPartOfASCIITable_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        byte startingIndex = Byte.parseByte(scanner.nextLine());
        byte endingIndex = Byte.parseByte(scanner.nextLine());

        for (int i = startingIndex; i <= endingIndex; i++) {
            char currentChar = (char) i;
            System.out.print(currentChar + " ");
        }
    }
}