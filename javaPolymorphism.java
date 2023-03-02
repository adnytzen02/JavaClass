class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {
    public.out.println("The Pig sound is: wee wee");
}

class Dog extends Animal {
    public.out.println("The dog sound is: won won");
}


class javaPolymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Animal myDog = new Dog();

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();

    }
}