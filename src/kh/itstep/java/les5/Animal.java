package kh.itstep.java.les5;

public abstract class Animal {

    public void introduce() {
        System.out.println(getIntroduction());
    }

    protected String getIntroduction() {
        return getIdentity() + getFoodIntroduction() + getSound().produce();
    }

    protected String getFoodIntroduction() {
        return "My favorite food is "+getFood()+", ";
    }

    protected abstract String getFood();
    protected abstract Sound getSound();


    protected String getIdentity() {
        return "I am " + getClass().getSimpleName() + ", ";
    }

}
