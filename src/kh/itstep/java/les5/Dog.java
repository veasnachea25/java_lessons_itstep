package kh.itstep.java.les5;

public class Dog extends Animal {
    @Override
    protected String getFood() {
        return "meat";
    }

    @Override
    protected Sound getSound() {
        return ()-> "woof";
    }
}
