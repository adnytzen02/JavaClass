public class Chicken extends Animal implements Edible{

    public Chicken() {
        super("Chicken");
    }

    @Override
    void makeSound() {
        System.out.println("clock!");
    }

    @Override
    public String howToEat() {
        return "Boiled chicken is not bad.";
    }
}
