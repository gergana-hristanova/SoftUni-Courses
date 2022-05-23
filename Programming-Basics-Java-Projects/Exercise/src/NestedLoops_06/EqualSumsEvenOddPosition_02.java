package NestedLoops_06;

import java.util.Scanner;

public class EqualSumsEvenOddPosition_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //въвеждаме двете шестцифрени числа
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        //създаваме цикъл, преминаващ през всички числа между num1 и num2
        for (int i = num1; i <= num2; i++) {
            //дефинираме променливи за:
            int evenSum = 0; //сумата на цифрите на четни позиции
            int oddSum = 0; //сумата на цифрите на нечетни позиции
            int digitPosition = 0; //позицията на сегашната цифра
            //превръщаме сегашното шестцифрено число в String
            String currentNumber = "" + i;
            //създаваме цикъл, преминаващ през цифрите в сегашното число
            for (int j = 0; j < currentNumber.length(); j++) {
                //инкрементираме позицията на цифрата
                digitPosition++;
                //четем цифрата като char
                char digit = currentNumber.charAt(j);
                //и я превръщаме в int
                int digitInt = Integer.parseInt(String.valueOf(digit));
                //проверяваме дали цифрата е на четно или нечетно място
                if (digitPosition % 2 == 0) {
                    evenSum += digitInt;
                } else {
                    oddSum += digitInt;
                }
            }
            //ако сумите са равни, извеждаме числото
            if (evenSum == oddSum) {
                System.out.print(i + " ");
            }
        }
    }
}