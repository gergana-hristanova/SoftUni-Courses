package DataTypesAndVariables;

import java.util.Scanner;

public class TownInfo_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int population = Integer.parseInt(scanner.nextLine());
        short area = Short.parseShort(scanner.nextLine());

        /*String result = String.format("Town %s has population of %d and area %d square km.", name, population, area);
        System.out.println(result);*/
        System.out.printf("Town %s has population of %d and area %d square km.", name, population, area);
    }
}