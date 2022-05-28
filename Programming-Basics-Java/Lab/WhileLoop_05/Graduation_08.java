package WhileLoop_05;

import java.util.Scanner;

public class Graduation_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //въвеждаме името на ученика
        String name = scanner.nextLine();
        //дефинираме променливи за:
        double gradesSum = 0; //сумата на оценките
        double gradesAmount = 0; //броя на оценките
        int schoolYears = 1; //учебните години
        int schoolYearsFailed = 0; //скъсаните учебни години
        //създаваме цикъл
        while (true) {
            //четем годишна оценка
            double grade = Double.parseDouble(scanner.nextLine());
            //добавяме я към сумата от оценки
            gradesSum += grade;
            //увеличаваме броя на оценките с 1
            gradesAmount++;
            //проверяваме дали учебната година е скъсана
            if (grade < 4) {
                schoolYearsFailed++;
            }
            //проверяваме дали ученикът е скъсан повече от 1 път
            if (schoolYearsFailed > 1) {
                System.out.printf("%s has been excluded at %d grade",
                        name, schoolYears - 1);
                break; //чрез break излиза ме от цикъла
            }
            //увеличаваме броя на учебните години с 1
            schoolYears++;
            //ако 12-тата учебна година е достигната
            if (schoolYears > 12) {
                //изчисляваме средната оценка за всичките години
                double average = gradesSum / gradesAmount;
                //извеждаме резултата
                System.out.printf("%s graduated. Average grade: %.2f",
                        name, average);
            }
        }
    }
}