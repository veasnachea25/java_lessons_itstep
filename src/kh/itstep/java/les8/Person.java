package kh.itstep.java.les8;

import java.util.*;

public class Person extends kh.itstep.java.les6.Person {
    private static final Map<Integer, String> months = new HashMap<Integer, String>(){{
        put(0, "January");
        put(1, "February");
        put(2, "March");
        put(3, "April");
        put(4, "May");
        put(5, "June");
        put(6, "July");
        put(7, "August");
        put(8, "September");
        put(9, "October");
        put(10, "November");
        put(11, "December");
    }};

    public static class Salary {
        private int month;
        private int income;

        public Salary(int month, int income) {
            this.month = month;
            this.income = income;
        }

        public int getIncome() {
            return income;
        }

        @Override
        public String toString() {
            return months.get(month)+" ("+income+")";
        }
    }

    private List<Salary> incomes = new ArrayList<Salary>();

    public Person(String firstName, String familyName) {
        super(firstName, familyName);
        int N = (int) (Math.random()*12 + 1);
        for (int i = 0; i < N; i++) {
            incomes.add(new Salary(i, (int) (Math.random()*1000)));
        }
    }

    public List<Salary> getIncomes() {
        return Collections.unmodifiableList(incomes);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder(super.toString());
        s.append(", incomes: [");
       incomes.stream()
                .map(salary -> salary.income)
                .forEach(integer -> s.append(integer).append(", "));
        return s.append("]").toString();
    }
}
