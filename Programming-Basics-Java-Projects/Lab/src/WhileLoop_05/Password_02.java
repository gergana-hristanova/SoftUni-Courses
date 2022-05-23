package WhileLoop_05;

import java.util.Scanner;

public class Password_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //въвеждаме данните
        String username = scanner.nextLine();
        String password = scanner.nextLine();
        //начален опит за въвеждаме на паролата
        String passwordTry = scanner.nextLine();
        //докато не сме въвели вярна парола
        while (!(password.equals(passwordTry))) {
            //правим нов опит
            passwordTry = scanner.nextLine();
        }

        System.out.printf("Welcome %s!", username);
    }
}