package kh.itstep.java.les8;

import java.util.*;

public class Launcher {
    private static class PersonMonth {
        private Person person;
        private Person.Salary salary;

        public PersonMonth(Person person, Person.Salary salary) {
            this.person = person;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return person + " -> " + salary;
        }
    }

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();
        for (int i = 0; i < 20; i++) {
            Person p = new Person("Name" + i, "LastName" + i);
            persons.add(p);
        }


        persons.stream().map(p -> {
            Optional<Person.Salary> max = p.getIncomes().stream().max(Comparator.comparingInt(salary -> salary.getIncome()));
            if (!max.isPresent()) throw new IllegalStateException("No incomes");
            return new PersonMonth(p, max.get());
        }).forEach(System.out::println);
    }
}
