## Polymorphism（多型）
Polymorphism（多型）是指物件可以表現出多種不同的型態或形式的特性。   
在物件導向程式設計中，Polymorphism 是一個重要的概念，它提供了一種方便且靈活的程式設計方式，
可以在不同類型的物件之間共享相同的介面或方法，而不需要考慮其實際類型。   

在 Java 中，Polymorphism 可以透過繼承和介面實現。   
當一個物件被聲明為父類型，而實際上指向子類型的實例時，就會產生 Polymorphism。   
這樣的物件可以被當做父類型的物件使用，也可以被當做子類型的物件使用，取決於它實際上所指向的物件型別。   

例如，在以下程式碼中：
```js
class Animal {
  public void makeSound() {
    System.out.println("Unknown sound");
  }
}

class Cat extends Animal {
  public void makeSound() {
    System.out.println("Meow");
  }
}

class Dog extends Animal {
  public void makeSound() {
    System.out.println("Woof");
  }
}

Animal animal1 = new Cat();
Animal animal2 = new Dog();
animal1.makeSound();
animal2.makeSound();
```

animal1 和 animal2 都是 Animal 型別的物件，但實際上分別指向 Cat 和 Dog 的實例。   
在呼叫 makeSound() 方法時，它們會分別呼叫對應子類別的 makeSound() 方法，因為這些方法已被覆寫。   
這種行為稱為 Polymorphism，因為 Animal 型別的物件可以表現出不同類型的特性。   