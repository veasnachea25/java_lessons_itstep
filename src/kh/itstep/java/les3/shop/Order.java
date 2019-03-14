package kh.itstep.java.les3.shop;

public class Order implements Constants {
    private static int nextId = 0;
    private int id = nextId++;

    private int status;

    public Order() {
        status = Status.NEW;
    }

    public Order send() {
        status = Status.SENT;
        return this;
    }

    public Order prepare() {
        status = Status.PREPARED;
        return this;
    }

    public Order postpone() {
        status = Status.PENDING;
        return this;
    }

    public int getStatus() {
        return status;
    }
}
