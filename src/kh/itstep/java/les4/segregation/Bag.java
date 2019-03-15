package kh.itstep.java.les4.segregation;

import java.util.HashSet;
import java.util.Set;

public class Bag implements Collection {
    private Set items = new HashSet();

    @Override
    public void add(Object o) {
        items.add(o);
    }

    @Override
    public void remove(Object o) {
        items.remove(o);
    }

}
