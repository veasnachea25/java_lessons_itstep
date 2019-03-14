package kh.itstep.java.les3.shop;

import java.util.ArrayList;
import java.util.List;

public class Shop implements Constants.Status {
    private List<Order> orders = new ArrayList<>();

    public List<Order> getUnsent() {
        List<Order> value = new ArrayList<>();
        for (Order order : orders) {
            if (order.getStatus() != Constants.Status.SENT) {
                value.add(order);
            }
        }
        return value;
    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.orders.add(new Order().send());
        shop.orders.add(new Order());
        shop.orders.add(new Order().send());
        shop.orders.add(new Order().send());
        shop.orders.add(new Order());
        shop.orders.add(new Order().send());
        shop.orders.add(new Order());
        List<Order> unsent = shop.getUnsent();
        System.out.println("Number of unsent orders is "+unsent.size());
    }

}
