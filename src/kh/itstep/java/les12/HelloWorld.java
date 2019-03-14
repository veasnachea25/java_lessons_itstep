package kh.itstep.java.les12;

public class HelloWorld  {

    private void testPrimitive(int val) {
        val++;
        System.out.println("Inside method = "+val);
    }

    private void testObject(Value val1) {
        val1.increase();
        System.out.println("Inside method = "+val1.getVal());
    }

    /* Program entry point */
    public static void main(String[] args) {
        HelloWorld instance = new HelloWorld();
        int val = 10;
        Value val1 = new Value(10);
        instance.testPrimitive(val);
        instance.testObject(val1);
        System.out.println("Outside primitive = "+val);
        System.out.println("Outside object = "+val1.getVal());
    }
}