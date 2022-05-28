package DataTypesAndVariables_02;

import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        byte n = Byte.parseByte(scanner.nextLine());

        String modelOfBiggestKeg = "";
        double volumeOfBiggestKeg = Double.MIN_VALUE;
        for (byte i = 1; i <= n; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = 2 * Math.PI * radius * radius * height;

            if (volume > volumeOfBiggestKeg) {
                volumeOfBiggestKeg = volume;
                modelOfBiggestKeg = model;
            }
        }

        System.out.println(modelOfBiggestKeg);
    }
}