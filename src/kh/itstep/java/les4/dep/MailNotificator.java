package kh.itstep.java.les4.dep;

import kh.itstep.java.les3.shop.Order;
import sun.net.www.protocol.mailto.MailToURLConnection;

public class MailNotificator implements CustomerNotificator {
    @Override
    public void notify(Order order) {
        //todo: send mail to customer
        MailToURLConnection open = new MailToURLConnection("mail.company.com");
        //put some attachement
        // add some text

    }
}
