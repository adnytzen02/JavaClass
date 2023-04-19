public abstract class Animal{
    protected String animalType;

    Animal(String animalType) {
        this.animalType = animalType;
    }

    void sleep() {
        System.out.println("This " + animalType + " is sleeping...");
    }

    abstract void makeSound();
}