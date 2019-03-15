package kh.itstep.java.les4.dep;

import kh.itstep.java.les3.shop.Order;

public class DatabaseNotificator implements StuffNotificator {
    @Override
    public void notify(Order order, int priority) {
        //todo: send notification
        Database db  = Database.get();
        Table table = db.openTable("orders");
        order.calculateTotal();
        table.execute("Insert into sdkjfhskjd hfks flkj h");
    }
}
