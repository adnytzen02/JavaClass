## Method Chaining

方法鏈（Method Chaining）是一種在物件導向程式設計語言中常見的設計技巧。透過這種技巧，可以讓我們在調用一個物件的多個方法時，將這些方法連接起來以簡化程式碼的寫法。方法鏈在設計模式中也被稱為 "Fluent Interface"。   
方法鏈在程式碼讀起來更流暢，也可以減少一些臨時變數的使用，但是在使用時需要注意方法的執行順序。由於 Java 是左至右運算，所以我們需要先呼叫屬性的設置方法，再呼叫其他的方法。此外，方法鏈也不應該過度使用，因為這可能會讓程式碼變得難以理解和維護。   
在Java中，方法鏈可行的原因是大部分方法都會返回它們被調用的物件本身，因此可以在同一個物件上連續調用多個方法。這種技巧在Java標準庫中常常被使用，例如在使用Swing庫建構GUI元素時。   
```js
public class Person {
    private String name;
    private int age;

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public void introduce() {
        System.out.println("My name is " + name + ", and I'm " + age + " years old.");
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person().setName("John").setAge(25);
        person.introduce(); // My name is John, and I'm 25 years old.
    }
}
```