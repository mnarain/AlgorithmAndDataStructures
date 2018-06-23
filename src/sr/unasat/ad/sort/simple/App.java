package sr.unasat.ad.sort.simple;

import sr.unasat.ad.common.PrintToConsole;
import sr.unasat.ad.entities.Person;

public class App {

    public static void main(String[] args) {
        Person p1 = new Person("Bob", "Marley");
        Person p2 = new Person("Kermit", "The Frog");
        Person p3 = new Person("John", "Doe");

        Person[] personArray = {p1, p2, p3};
        Person[] orderdList = BubbleSort.sortPersonList(personArray);

        PrintToConsole.execute(orderdList);
    }
}
