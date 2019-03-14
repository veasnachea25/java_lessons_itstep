package kh.itstep.java.les12;

public class Value {
    private int val;

    public Value(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public int increase() {
        val++;
        return val;
    }
}
