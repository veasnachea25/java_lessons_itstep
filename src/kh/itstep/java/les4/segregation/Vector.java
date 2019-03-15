package kh.itstep.java.les4.segregation;


public class Vector implements OrderedCollection {
    private Object items[] = new Object[100];
    private int idx;

    @Override
    public Object get(int idx) {
        return items[idx];
    }

    @Override
    public void add(Object o) {
        items[idx++] = o;
    }

    @Override
    public void remove(Object o) {
        //todo;
    }
}
