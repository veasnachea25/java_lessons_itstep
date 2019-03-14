package kh.itstep.java.les3;

public class Program {

    private List c1;

    public void fill() {
        c1 = new DynamicArray();
        for (int i = 0; i < 10; i++) {
            c1.add("Item #"+i);
        }
    }

    private void readItem(int i) {
        try {
            System.out.println(c1.get(i));
        } catch (NotInRangeError error) {
            System.out.println("Hey, there's no such item");
            throw error;
        }
    }

    public void read() {
        for (int i = 0; i < 100; i++) {
            try {
                readItem(i);
            } catch (NotInRangeError e) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        Program p = new Program();
        p.fill();
        p.read();
    }
}
