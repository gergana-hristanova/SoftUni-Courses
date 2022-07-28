package opinionpoll_03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] personData = scanner.nextLine().split(" ");
            String personName = personData[0];
            int personAge = Integer.parseInt(personData[1]);

            Person person = new Person(personName, personAge);

            if (person.getAge() > 30) {
                System.out.println(person.toString());
            }
        }
    }
}