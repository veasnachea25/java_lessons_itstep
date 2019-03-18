package kh.itstep.java.les5;

public class Cat extends Animal {
    @Override
    protected String getFood() {
        return "milk";
    }

    @Override
    protected Sound getSound() {
        return ()->"meow";
    }
}
