package students_05;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Student> studentsList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] studentData = scanner.nextLine().split(" ");
            String studentFirstName = studentData[0];
            String studentLastName = studentData[1];
            double studentGrade = Double.parseDouble(studentData[2]);

            Student student = new Student(studentFirstName, studentLastName, studentGrade);
            studentsList.add(student);
        }

        studentsList.sort(Comparator.comparingDouble(Student :: getGrade));
        Collections.reverse(studentsList);

        for (Student student : studentsList) {
            System.out.println(student.toString());
        }
    }
}