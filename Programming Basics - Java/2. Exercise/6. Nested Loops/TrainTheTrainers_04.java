package NestedLoops_06;

import java.util.Scanner;

public class TrainTheTrainers_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //въвеждаме броя на хората в журито
        int juryMembers = Integer.parseInt(scanner.nextLine());
        //и началния вход
        String input = scanner.nextLine();
        //дефинираме променливи за:
        double totalGradesSum = 0; //сумата на общо всички оценки
        int totalGradesAmount = 0; //броя на общо всички оценки
        //докато не получим команда Finish
        while (!input.equals("Finish")) {
            //чрез input четем името на проекта
            String projectName = input;
            //дефинираме променливи за:
            double gradesSum = 0; //сумата на оценките от този проект
            int gradesAmount = 0; //броя на оценките от този проект
            //докато всеки от хората в журито не даде оценка
            for (int i = 1; i <= juryMembers; i++) {
                //четем оценката
                double grade = Double.parseDouble(scanner.nextLine());
                //добавяме я към сумата на оценките от този проект
                gradesSum += grade;
                gradesAmount++;
                //добавяме я към сумата на общо всички оценки
                totalGradesSum += grade;
                totalGradesAmount++;
            }
            //изчисляваме средната оценка за проекта и я извеждаме
            double gradeAverage = gradesSum / gradesAmount;
            System.out.printf("%s - %.2f.%n", projectName, gradeAverage);
            //четем нов вход
            input = scanner.nextLine();
        }
        //изчисляваме общата оценка на студента
        System.out.printf("Student's final assessment is %.2f.",
                totalGradesSum / totalGradesAmount);
    }
}