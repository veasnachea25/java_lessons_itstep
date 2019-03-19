package kh.itstep.java.les6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Set list = new HashSet();
//        list.add(new Person("John", "Smith"));
//        list.add(new Person("John", "Smith"));
//        System.out.println(list.size());

        Set<Sum> items = new HashSet<Sum>();
        items.add(new Sum(2,5));
        items.add(new Sum(1,8));
        items.add(new Sum(3,4));
        items.add(new Sum(2,5));
        for (Sum item : items) {
            System.out.println(item);
            System.out.println(item.get());
        }
    }
}
