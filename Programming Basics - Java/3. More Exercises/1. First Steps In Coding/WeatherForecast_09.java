package FirstStepsInCoding_01;

import java.util.Scanner;

public class WeatherForecast_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        switch (input) {
            case "sunny": System.out.println("It's warm outside!"); break;
            default: System.out.println("It's cold outside!");
        }
    }
}