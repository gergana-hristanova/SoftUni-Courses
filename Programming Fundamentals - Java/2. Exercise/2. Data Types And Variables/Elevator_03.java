package DataTypesAndVariables_02;

import java.util.Scanner;

public class Elevator_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        short n = Short.parseShort(scanner.nextLine());
        byte p = Byte.parseByte(scanner.nextLine());

        short result = (short) Math.ceil((double) n / p);
        System.out.println(result);
    }
}