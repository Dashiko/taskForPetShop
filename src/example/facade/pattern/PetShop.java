package example.facade.pattern;

public class PetShop {
    private final Hedgehog hedgehog;
    private final Dog dog;
    private final Cat cat;

    public PetShop() {
        hedgehog = new Hedgehog();
        dog = new Dog();
        cat = new Cat();
    }

    public void hedgehogEats() {
        hedgehog.eat();
    }

    public void dogEats() {
        dog.eat();
    }

    public void catEats() {
        cat.eat();
    }

    public void hedgehogSleeps() {
        hedgehog.sleep();
    }

    public void dogSleeps() {
        dog.sleep();
    }

    public void catSleeps() {
        cat.sleep();
    }

    public void hedgehogRuns() {
        hedgehog.run();
    }

    public void dogRuns() {
        dog.run();
    }

    public void catRuns() {
        cat.run();
    }
}
