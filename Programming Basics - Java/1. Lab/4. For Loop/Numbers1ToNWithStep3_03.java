package ForLoop_04;

import java.util.Scanner;

public class Numbers1ToNWithStep3_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //въвеждаме n
        int n = Integer.parseInt(scanner.nextLine());
        //докато i <= n, увеличаваме i с 3
        for (int i = 1; i <= n; i += 3) {
            System.out.println(i);
        }
    }
}