package kh.itstep.java.les4;

public class LSViolation {
    public static void main(String[] args) {
        ClassA items[] = new ClassA[5];
        items[0] = new ClassA();
        items[1] = new ClassBGood();
        items[2] = new ClassCCorrector();
        items[3] = new ClassA();
        items[4] = new ClassBGood();

        for (ClassA item : items) {
            item.out();
        }
    }
}
