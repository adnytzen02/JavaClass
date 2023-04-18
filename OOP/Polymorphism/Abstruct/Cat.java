public class Cat extends Animal{

    public Cat() {
        super("Cat");
    }


    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}