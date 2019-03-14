package kh.itstep.java.les12;

public class Settings {
    private int counter = 0;

    private static Settings instance = null;

    public static Settings getInstance() {
        if (null == instance) instance = new Settings();
        return instance;
    }

    private Settings() {
        //read the file with settings
    }

    public void increment() {
        counter ++;
    }

    public int getCounter() {
        return counter;
    }
}
