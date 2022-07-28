package DataTypesAndVariables_02;

import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        byte n = Byte.parseByte(scanner.nextLine());

        short poolCapacity = 255;
        for (byte i = 1; i <= n; i++) {
            short input = Short.parseShort(scanner.nextLine());
            if (input > poolCapacity) {
                System.out.println("Insufficient capacity!");
            } else {
                poolCapacity -= input;
            }
        }

        System.out.println(Math.abs(poolCapacity - 255));
    }
}