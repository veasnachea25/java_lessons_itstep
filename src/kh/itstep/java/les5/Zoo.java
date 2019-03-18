package kh.itstep.java.les5;

import java.util.Date;
import java.util.Timer;

public class Zoo {
    public class Worker {
        public void feed() {
            for (Animal animal : animals) {
                feed(animal);
            }
        }

        public void feed(Animal animal) {
            System.out.println("I'm feeding "+animal.getIdentity()+" with "+animal.getFood());
        }
    }

    private static int id = 0;
    private Animal[] animals;

    public Zoo(Animal[] animals) {
        this.animals = animals;
    }

    public void act() {
        for (Animal animal : animals) {
            animal.introduce();
        }
        Worker worker1 = new Worker();
        worker1.feed();
    }


    public static void main(String[] args) {
        Zoo zoo1 = new Zoo(new Animal[]{
                new Dog(),
                new Cat(),
                new Animal() {
                    @Override
                    public void introduce() {
                        String food = getFood();
                        Sound sound = getSound();
                        try {
                            Thread.sleep(2000);
                            System.out.println("food: "+food);
                            System.out.println("sound: "+sound.produce());
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    @Override
                    protected String getFood() {
                        return new Date().toString();
                    }

                    @Override
                    protected Sound getSound() {
                        return () -> new Date().toString();
                    }
                },
        });
        zoo1.act();
    }
}
