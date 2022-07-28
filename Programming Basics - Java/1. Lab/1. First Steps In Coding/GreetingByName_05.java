package FirstStepsInCoding_01;
import java.util.Scanner;

public class GreetingByName_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.print("Hello, ");
        System.out.print(name);
        System.out.print("!");
        //or System.out.println("Hello, " + name + "!");
        //долепяне = КОНКАТЕНАЦИЯ
    }
}
