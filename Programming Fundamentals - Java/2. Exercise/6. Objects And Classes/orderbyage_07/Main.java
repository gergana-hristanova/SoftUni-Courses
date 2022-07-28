package orderbyage_07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] personData = scanner.nextLine().split(" ");
        List<Person> personList = new ArrayList<>();

        while (!personData[0].equals("End")) {
            String personName = personData[0];
            String personID = personData[1];
            int personAge = Integer.parseInt(personData[2]);

            Person person = new Person(personName, personID, personAge);
            personList.add(person);

            personData = scanner.nextLine().split(" ");
        }

        personList.sort(Comparator.comparing(Person::getAge));

        for (Person person : personList) {
            System.out.println(person.toString());
        }
    }
}
