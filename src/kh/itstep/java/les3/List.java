package kh.itstep.java.les3;

public interface List extends Collection {
    Object get(int position) throws NotInRangeError;
    int size();
}
