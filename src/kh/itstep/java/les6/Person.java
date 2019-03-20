package kh.itstep.java.les6;

import java.util.Comparator;

public class Person {
    private String firstName;
    private String familyName;

    public Person(String firstName, String familyName) {
        this.firstName = firstName;
        this.familyName = familyName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Person &&
                ((Person) obj).firstName.equals(firstName) &&
                ((Person) obj).familyName.equals(familyName);
    }

    @Override
    public int hashCode() {
        return (int) (Math.random()*1000);
    }

    @Override
    public String toString() {
        return firstName + " " + familyName;
    }

    public boolean contains(String filter) {
        String lowerFilter = filter.toLowerCase();
        return firstName.toLowerCase().contains(lowerFilter) ||
               familyName.toLowerCase().contains(lowerFilter);
    }

    public static final Comparator<? super Person> namesComparator = Comparator.comparing((Person p) -> p.familyName).thenComparing(p -> p.firstName);

}
