package ForLoop_04;

import java.util.Scanner;

public class EvenPowersOf2_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //въвеждаме n
        int n = Integer.parseInt(scanner.nextLine());
        //докато i <= n
        for (int i = 0; i <= n; i++) {
            //ако i е четно число
            if (i % 2 == 0) {
                //измевдаме 2 на степен i
                System.out.printf("%.0f%n", Math.pow(2, i));
            }
        }
    }
}