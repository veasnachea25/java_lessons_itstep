package kh.itstep.java.les6;

public class Sum {
    private int a;
    private int b;

    public Sum(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int get() {
        return a+b;
    }

    @Override
    public String toString() {
        return "Sum of "+a+" and "+b+" = "+get();
    }

    @Override
    public int hashCode() {
        return a << 8 + b;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Sum && obj.hashCode() == hashCode();
    }
}
