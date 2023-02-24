package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Person[] people = new Person[3];
        PersonUtils utils = new PersonUtils();
        utils.typePeople(people);
        utils.printInfo(people);
    }
}
