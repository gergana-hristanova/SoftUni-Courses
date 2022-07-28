package DataTypesAndVariables_02;

import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        byte Y = Byte.parseByte(scanner.nextLine());

        double halfOfN = N * 0.5;
        short pokesCounter = 0;
        while (N >= M) {
                N -= M;
                pokesCounter++;

            if (N == halfOfN && Y != 0) {
                N /= Y;
            }
        }

        System.out.println(N);
        System.out.println(pokesCounter);
    }
}
