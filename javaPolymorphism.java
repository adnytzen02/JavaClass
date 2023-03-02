class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

// 建立 Animal 的子class 
class Cat extends Animal {
    public.out.println("The Cat sound is: Meow Meow");
}

class Dog extends Animal {
    public.out.println("The dog sound is: won won");
}

// 建立 Cat/Dog Object 調用 AnimalSound 的 Method()
class javaPolymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myCat = new Cat();
        Animal myDog = new Dog();

        myAnimal.animalSound();
        myCat.animalSound();
        myDog.animalSound();

    }
}