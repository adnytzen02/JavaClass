public class Dog extends Animal{

    public Dog() {
        super("Dog");
    }

    @Override
    void makeSound() {
        System.out.println("WOW!");
    }
}