package example.facade.pattern;

public class Main {
    public static void main(String[] args) {
        PetShop petShop = new PetShop();
        petShop.catEats();
        petShop.dogSleeps();
        petShop.hedgehogRuns();
    }
}