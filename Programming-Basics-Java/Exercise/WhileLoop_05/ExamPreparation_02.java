package WhileLoop_05;

import java.util.Scanner;

public class ExamPreparation_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //въвеждаме максималния брой лоши оценки
        int maxPoorGrades = Integer.parseInt(scanner.nextLine());
        //въвеждаме името на задачата и оценката от нея
        String problemName = scanner.nextLine();
        double problemGrade = Double.parseDouble(scanner.nextLine());
        //дефинираме променливи за:
        int poorGradesCounter = 0; //брояч за лошите оценки
        int problemsCounter = 0; // брояч за задачите
        double problemsSum = 0; //сумата на оценките от задачите
        String lastProblem = null; //променлива за последната решена задача
        boolean failed = false; //проверка дали са направени достатъчно лоши оценки
        //докато не получим команда Enough:
        while (!problemName.equals("Enough")) {
            //проверяваме дали оценката не е лоша
            if (problemGrade <= 4) {
                poorGradesCounter++;
            } //проверяваме дали не са направени достатъчно лоши оценки
            if (poorGradesCounter >= maxPoorGrades) {
                failed = true;
                break;
            }
            //увеличаваме броя на задачите
            problemsCounter++;
            //добавяме оценката към сумата от задачи
            problemsSum += problemGrade;
            //запазваме името на последната решена задача
            lastProblem = problemName;
            //ако не е въведена командата Enough, проверяваме за следваща задача
            problemName = scanner.nextLine();
            if (!problemName.equals("Enough")) {
                problemGrade = Double.parseDouble(scanner.nextLine());
            }
        }
        //ако Марин е изкарал достатъчно лоши оценки
        if(failed) {
            System.out.printf("You need a break, %d poor grades.", poorGradesCounter);
        } else { //ако не е, извеждаме резултатите
            double averageScore = problemsSum / problemsCounter;
            System.out.printf("Average score: %.2f%n", averageScore);
            System.out.printf("Number of problems: %d%n", problemsCounter);
            System.out.printf("Last problem: %s", lastProblem);
        }
    }
}