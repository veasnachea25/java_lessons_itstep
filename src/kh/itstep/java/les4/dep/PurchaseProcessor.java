package kh.itstep.java.les4.dep;

import kh.itstep.java.les3.shop.Order;
import sun.net.www.protocol.mailto.MailToURLConnection;

import java.sql.DatabaseMetaData;

public class PurchaseProcessor {
    public static void main(String[] args) {
        Order order = new Order();
        //prepare order
        order.calculateTotal();
        CustomerNotificator notificator = new MailNotificator();
        StuffNotificator stuffNotificator = new TelegramNottificator();
        OrderProcessor processor = new Processor1();

        notificator.notify(order);
        stuffNotificator.notify(order, 1);
        processor.process(order);
    }
}
