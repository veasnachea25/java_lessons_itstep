package kh.itstep.java.les3;

public class DynamicArray implements List {
    private Object[] items;
    private int capacity = 0;
    private int length = 0;

    @Override
    public void add(Object item) {
        if (capacity <= length) {
            int oldCapacity = capacity;
            capacity = (capacity == 0) ? 5 : (capacity * 2);
            Object[] oldItems = items;
            items = new Object[capacity];
            if (oldItems !=  null) {
                System.arraycopy(oldItems, 0, items, 0, oldCapacity);
            }
        }
        items[length++] = item;
    }

    @Override
    public boolean remove(Object item) {
        int idx = indexOf(item);
        if (-1 != idx) {
            for (int i = idx; i < length-1; i++) {
                items[i] = items[i+1];
            }
            items[--length] = null;
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(Object item) {
        for (int i = 0; i < length; i++) {
            if (items[i].equals(item)) return true;
        }
        return false;
    }

    public int indexOf(Object item) {
        for (int i = 0; i < length; i++) {
            if (items[i].equals(item)) return i;
        }
        return -1;
    }

    public int size() {
        return length;
    }

    public Object get(int idx) throws NotInRangeError {
        if (idx < 0 || idx >= length) throw new NotInRangeError("Booo");
        return items[idx];
    }
}
