package kh.itstep.java.les7;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Streams {
    private static void people() {
        String filter = "an";

        Set<Person> persons = new HashSet<Person>(){{
            add(new Person("John", "Doe", 300));
            add(new Person("Jane", "Doe", 250));
            add(new Person("John", "Smith", 400));
            add(new Person("Jill", "Smith", 350));
            add(new Person("Joel", "Miller", 450));
            add(new Person("Sam", "Smith", 150));
            add(new Person("Sean", "Connery", 750));
            add(new Person("Uma", "Noel", 550));
            add(new Person("Sam", "Patterson", 350));
            add(new Person("Nicolas", "Patterson", 250));
            add(new Person("John", "Doe", 600));
        }};

        Optional<Person> richie = persons.stream().max(Comparator.comparingInt(Person::getIncome));
        richie.ifPresent(person -> System.out.println("Person with highest income: "+person));

        System.out.println("\nFiltered and sorted:");
        persons.stream().filter(p -> p.contains(filter))
                .sorted(Person.namesComparator)
                .forEach(System.out::println);
    }

    private static void examples() {
        int max = Stream.of(5, 2, 1, 0, 4, 6, 9)
                .reduce((acc, current) -> acc < current ? current : acc).get();
        int sum = Stream.of(5, 2, 1, 0, 4, 6, 9)
                .reduce((acc, current) -> acc + current).get();
        System.out.println(max);
    }


    public static void main(String[] args) {
//        people();
        examples();
    }
}
