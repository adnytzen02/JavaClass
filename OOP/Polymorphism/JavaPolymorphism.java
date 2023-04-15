// 定義 Animal class
class Animal {
    public void animalSound() { // 定義 animalSound() 方法
        System.out.println("The animal makes a sound");
    }
}

// 定義 Cat class，繼承自 Animal class
class Cat extends Animal {
    public void animalSound() { // 覆寫 animalSound() 方法
        System.out.println("The Cat sound is: Meow Meow");
    }
}

// 定義 Dog class，繼承自 Animal class
class Dog extends Animal {
    public void animalSound() { // 覆寫 animalSound() 方法
        System.out.println("The dog sound is: won won");
    }
}

// 主程式類別
class JavaPolymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // 建立 Animal 物件
        Animal myCat = new Cat(); // 建立 Cat 物件，存入 Animal 型別變數
        Animal myDog = new Dog(); // 建立 Dog 物件，存入 Animal 型別變數
        myAnimal.animalSound(); // 呼叫 Animal 物件的 animalSound() 方法
        myCat.animalSound(); // 呼叫 Cat 物件的 animalSound() 方法，實際執行的是 Cat 類別中覆寫後的方法
        myDog.animalSound(); // 呼叫 Dog 物件的 animalSound() 方法，實際執行的是 Dog 類別中覆寫後的方法
    }
}
