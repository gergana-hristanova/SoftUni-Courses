package objectsandclasses_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students2_06 {

    static class Student {
        String firstName;
        String lastName;
        String age;
        String hometown;

        public Student(String firstName, String lastName, String age, String hometown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.hometown = hometown;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public String getAge() {
            return this.age;
        }

        public String getHometown() {
            return this.hometown;
        }
    }
    //представеното решение е опростено, не като това от документа
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] studentDataArr = scanner.nextLine().split(" ");

        List<Student> studentsList = new ArrayList<>();
        while (!studentDataArr[0].equals("end")) {

            String firstNameInput = studentDataArr[0];
            String lastNameInput = studentDataArr[1];
            String ageInput = studentDataArr[2];
            String hometownInput = studentDataArr[3];

            for (int i = 0; i < studentsList.size(); i++) {
                Student currentStudent = studentsList.get(i);
                if (currentStudent.getFirstName().equals(firstNameInput) &&
                    currentStudent.getLastName().equals(lastNameInput)) {
                        studentsList.remove(studentsList.get(i));
                    }
                }

            Student currentStudent = new Student(firstNameInput, lastNameInput, ageInput, hometownInput);
            studentsList.add(currentStudent);

            studentDataArr = scanner.nextLine().split(" ");
        }

        String wantedHometown = scanner.nextLine();
        for (Student student : studentsList) {
            if (student.getHometown().equals(wantedHometown)) {

                System.out.printf("%s %s is %s years old%n",
                        student.getFirstName(),
                        student.getLastName(),
                        student.getAge());
            }
        }
    }
}