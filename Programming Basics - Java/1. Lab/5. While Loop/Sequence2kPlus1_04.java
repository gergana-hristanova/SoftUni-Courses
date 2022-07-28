package WhileLoop_05;

import java.util.Scanner;

public class Sequence2kPlus1_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //въвеждаме n
        int n = Integer.parseInt(scanner.nextLine());
        //дефинираме началната стойност на k
        int k = 1;
        //докато k <= n
        while (k <= n) {
            //принтираме k и актуализираме стойността ѝ
            System.out.println(k);
            k = 2 * k + 1;
        }
    }
}