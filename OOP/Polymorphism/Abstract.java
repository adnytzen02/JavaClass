public class Abstract {

    public static void main(String[] args) {
        Animal dog1 = new Dog();
        Animal cat1 = new Cat();

        cat1.makeSound();
    }
}

abstract class Animal {
    protected String animalType;

    Animal(String animalType) {
        this.animalType = animalType;
    }

    void sleep() {
        System.out.println("This " + animalType + " is sleeping...");
    }

    abstract void makeSound();
}

class Dog extends Animal {

    Dog() {
        super("Dog");
    }

    @Override
    void makeSound() {
        System.out.println("brock!");
    }
}

class Cat extends Animal {
    Cat() {
        super("Cat");
    }
    @Override
    void makeSound() {
        System.out.println("Meow!");
    }

}
