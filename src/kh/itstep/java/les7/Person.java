package kh.itstep.java.les7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person extends kh.itstep.java.les6.Person {
    private int income;
    private List<kh.itstep.java.les6.Person> kids;

    public Person(String firstName, String familyName, int income) {
        super(firstName, familyName);
        this.income = income;
    }

    public void addKid(kh.itstep.java.les6.Person kid) {
        if (kids == null) {
            kids = new ArrayList<>();
        }
        kids.add(kid);
    }

    public int getIncome() {
        return income;
    }

    public List<kh.itstep.java.les6.Person> getKids() {
        return Collections.unmodifiableList(kids);
    }

    @Override
    public String toString() {
        return super.toString()+", income: "+income;
    }
}
