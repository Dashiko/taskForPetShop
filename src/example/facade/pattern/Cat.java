package example.facade.pattern;

public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("The cat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("The cat is sleeping");
    }

    @Override
    public void play() {
        System.out.println("The cat is playing");
    }

    @Override
    public void run() {
        System.out.println("The cat is running");
    }
}
