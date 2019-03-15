package kh.itstep.java.les4.dep;

import kh.itstep.java.les3.shop.Order;

public interface StuffNotificator {
    void notify(Order order, int priority);
}
