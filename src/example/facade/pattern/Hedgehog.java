package example.facade.pattern;

public class Hedgehog implements Animal {
    @Override
    public void eat() {
        System.out.println("The hedgehog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("The hedgehog is sleeping");
    }

    @Override
    public void play() {
        System.out.println("The hedgehog is playing");
    }

    @Override
    public void run() {
        System.out.println("The hedgehog is running");
    }
}
