package pl.javastart.task;

import java.util.Scanner;

public class PersonUtils {

    private Scanner scanner = new Scanner(System.in);
    private int counter = 0;

    void typePeople(Person[] people) {
        do {
            System.out.println("Podaj imie:");
            String firstName = scanner.nextLine();
            System.out.println("Podaj wiek:");
            int age = scanner.nextInt();
            scanner.nextLine();
            Person person = new Person(firstName, age);
            if (!isAlreadyExist(people, person)) {
                people[counter] = person;
                counter++;
            } else {
                System.out.println("Duplikat");
            }
        } while (counter < people.length);
    }

    private boolean isAlreadyExist(Person[] people, Person person) {
        for (Person value : people) {
            if (value != null) {
                return value.equals(person);
            }
        }
        return false;
    }

    void printInfo(Person[] people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
