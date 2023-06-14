## OOP (Object-Oriented Programming) 面向對象編程

OOP（Object-Oriented Programming）為面向對象編程的縮寫，是一種計算機編程范式或編程風格，旨在通過封裝、繼承和多態等概念來組織代碼並提高代碼的可重用性、可維護性和可擴展性。   

在 OOP 中，代碼被組織成對象的形式，每個對象擁有自己的狀態和行為。對象的狀態由其屬性（即數據）描述，而行為則由其方法（即函數）定義。通過封裝，對象的內部狀態被保護，只有對象的方法可以修改它。通過繼承，子類可以從父類繼承屬性和方法，從而實現代碼的複用。通過多態，不同的對象可以對相同的消息作出不同的響應，從而實現代碼的靈活性和擴展性。   

OOP 在軟件開發中被廣泛應用，包括面向對象分析、設計和編程等方面。常用的面向對象編程語言包括 Java、C++、Python、C# 等。   


在物件導向的程式語言 ( Object-Oniented Programming ) OOP，為這三個類    

1. Encapsulation ( 封裝 )
2. Inheritance ( 繼承 )
3. Polymorphism ( 多態性 )


### 封裝 ( Encapsulation )

封裝（Encapsulation）是面向對象編程中的一個重要概念，它指的是將物件的內部狀態和行為隱藏起來，只對外部提供必要的接口和方法來訪問和操作物件。

1. 封裝的目的是保護物件的內部狀態和實現細節，同時提供必要的公開方法和接口來操作和訪問物件。
2. 封裝通常是通過類別設計和存取修飾符來實現的，使用 private、protected 和 public 存取修飾符來限制對物件的訪問和操作。
3. 在設計類別時，應該將物件的內部狀態和行為定義在類別內部，使用 private 修飾符來限制訪問，只提供必要的公開方法和接口來操作和訪問物件。
4. 封裝可以提高程式的可靠性、安全性和可維護性，防止外部程式訪問和修改物件的內部狀態，從而減少程式出錯的概率，提高程式的穩定性和安全性。
5. 封裝可以隱藏物件的實現細節，使外部程式只需要知道如何使用物件，而不需要知道物件的內部實現細節，從而提高程式的抽象性和可讀性。
6. 設計公開方法和接口時，應該考慮方法的參數、返回值和異常處理等方面，確保方法的正確性、可靠性和安全性，並且應該提供適當的文檔和示例來描述方法的功能和使用方法。

* 範例
```js
public class Person {
    // fields ( 段 )
    private String name; // 私有成員變數 name
    private int age; // 私有成員變數 age

    // 公開的設置 name 方法，用於設置 name 屬性的值
    public void setName(String name) {
        this.name = name;
    }

    // 公開的獲取 name 方法，用於獲取 name 屬性的值
    public String getName() {
        return this.name;
    }

    // 公開的設置 age 方法，用於設置 age 屬性的值
    public void setAge(int age) {
        if (age < 0) { // 檢查 age 是否小於 0
            this.age = 0; // 如果小於 0，則將 age 設置為 0
        } else {
            this.age = age; // 否則，將 age 設置為指定的值
        }
    }

    // 公開的獲取 age 方法，用於獲取 age 屬性的值
    public int getAge() {
        return this.age;
    }
}
```
* 外部程式只需要知道如何使用 Person 類別，而不需要知道 Person 類別的內部實現細節。在設置 age 的方法中，還添加了檢查 age 是否小於 0 的邏輯，從而保護 age 的合法性。

   
### 繼承 (Inheritance)
在Java中，繼承（Inheritance）是一種對象導向編程的概念，它允許一個類（稱為子類或派生類）繼承另一個類（稱為父類或基類）的屬性和方法。繼承建立了一個"是一個"（is-a）的關係，即子類是父類的特殊類型。      
      
繼承的主要優點是代碼重用和階層結構的建立。通過繼承，子類可以繼承父類的屬性和方法，並且還可以添加自己的特定屬性和方法。這樣可以節省代碼，並且使代碼更具結構性和可擴展性。      
      
在Java中，使用關鍵字`extends`來實現繼承。子類可以繼承父類的非私有成員（字段和方法），包括公共（`public`）、受保護（`protected`）和默認（沒有顯式修飾符）訪問修飾符修飾的成員。      
      
下面是一個簡單的示例，展示了Java中的繼承：      
      
```java
public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }
}

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Bobby");
        dog.eat(); // 繼承自Animal類
        dog.bark(); // Dog類的特有方法
    }
}
```
      
在上述示例中，`Animal`類是父類，`Dog`類是子類。`Dog`類繼承了`Animal`類，繼承了父類的`name`字段和`eat()`方法。同時，`Dog`類還添加了自己的`bark()`方法。      
      
在`Main`類中，我們創建了一個`Dog`對象並調用其繼承的方法和自身的方法。      
      
通過繼承，`Dog`類可以重用`Animal`類的代碼，並擴展了自己的功能。這使得代碼更具結構性，同時還保持了代碼的可讀性和維護性。      
        
### super
在Java中，`super`是一個關鍵字，用於引用父類（基類）的成員（字段、方法、構造函數）。它通常用於子類中，用於訪問和調用父類的成員。      
      
以下是`super`關鍵字在不同情境下的使用方式：      
      
1. 訪問父類的字段：使用`super`關鍵字可以訪問父類中的字段，即使子類中有相同名稱的字段也可以通過`super`關鍵字訪問到父類的字段。
      
2. 調用父類的方法：使用`super`關鍵字可以調用父類中的方法，即使子類中有相同名稱的方法也可以通過`super`關鍵字調用到父類的方法。
      
3. 調用父類的構造函數：在子類的構造函數中，可以使用`super`關鍵字調用父類的構造函數。這樣可以初始化父類的成員，並確保父類的構造函數被執行。
         
         
### Override
在Java中，方法覆寫（Method Overriding）是一種面向對象編程的概念，它允許子類重寫（覆寫）父類中已有的方法，以定義自己的實現方式。這樣做可以使子類在具有相同方法簽名的情況下，改變該方法的行為，實現多態性。         
         
方法覆寫需要滿足以下條件：         
         
1. 子類中的方法名、返回類型和方法參數列表必須與父類中被覆寫的方法完全相同。
         
2. 子類中的方法訪問修飾符可以擴大（如從protected到public），但不能縮小（如從public到private）。
         
3. 子類中的方法不能抛出比父類中被覆寫方法更多的異常，可以抛出相同的異常或者不抛出異常。
         

### Polymorphism
在Java中，多態性（Polymorphism）是一種面向對象編程的概念，它允許使用基類（父類）的引用變量來引用子類的對象，並根據實際的對象類型來調用相應的方法。這樣可以在不同的對象上呈現相同的行為，實現代碼的重用和靈活性。

Java中的多態性主要基於兩個機制：繼承和方法覆寫。

繼承：通過繼承，子類可以繼承父類的屬性和方法。當我們使用父類的引用變量來引用子類的對象時，可以通過這個引用變量訪問和調用父類中的成員，也可以根據實際的對象類型調用子類中覆寫的方法。

方法覆寫：子類可以重寫（覆寫）父類中已有的方法，以定義自己的實現方式。當使用父類引用變量引用子類對象並調用該方法時，根據實際的對象類型，將調用子類中覆寫的方法。

下面是一個示例，展示了多態性的使用：

```java
public class Animal {
    public void makeSound() {
        System.out.println("Animal is making a sound.");
    }
}

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat is meowing.");
    }
}

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog is barking.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Cat();
        Animal animal3 = new Dog();

        animal1.makeSound(); // 輸出: Animal is making a sound.
        animal2.makeSound(); // 輸出: Cat is meowing.
        animal3.makeSound(); // 輸出: Dog is barking.
    }
}
```

在上述示例中，`Animal`類是父類，`Cat`類和`Dog`類都是子類。我們創建了父類引用變量`animal1`，並用它分別引用了`Animal`、`Cat`和`Dog`類的對象。通過這些引用變量，我們可以調用`makeSound()`方法。

根據對象的實際類型，將調用相應的方法。當`animal1`引用`Animal`對象時，調用的是

`Animal`類的`makeSound()`方法；當`animal2`引用`Cat`對象時，調用的是`Cat`類的`makeSound()`方法；當`animal3`引用`Dog`對象時，調用的是`Dog`類的`makeSound()`方法。

這就是多態性的體現，同一個方法根據實際的對象類型而具有不同的行為。這種特性使得代碼更具靈活性、可擴展性和可重用性。