package example.facade.pattern;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("The dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("The dog is sleeping");
    }

    @Override
    public void play() {
        System.out.println("The dog is playing");
    }

    @Override
    public void run() {
        System.out.println("The dog is running");
    }
}
