## Java Method
方法是僅在調用時運行的代碼塊。   
您可以將稱為參數的數據傳遞到方法中。   
方法用於執行某些操作，它們也稱為函數。   

```js
public class Main {
  static void myMethod() {
    // code to be executed
  }
}
```
* myMethod() 是方法的名稱
* static 意味著該方法屬於 class Main 而不是 class Object。
* void 代表這個 Method 沒有 retrun 的值。

### Method overloading
指在一個類中可以定義多個方法，它們具有相同的方法名但具有不同的參數列表。   
這意味著在調用這些方法時，編譯器會根據傳遞給方法的參數類型和數量來選擇最匹配的方法。   

使用Java方法重載的好處是，它可以使代碼更簡潔和易讀，
因為可以使用相同的方法名來處理多個不同的輸入情況，而無需為每個情況創建新的方法名。
```js
public class Calculator {
    public int add(int x, int y) {
        return x + y;
    }

    public double add(double x, double y) {
        return x + y;
    }
}
```

### Scope
Java 中的作用域（Scope）是指在程式碼中定義變數的區域，該區域中定義的變數只能在該區域內部被訪問。Java 中有四種作用域：   
1. 類作用域（Class Scope）：指在類中定義的變數，它們可以在整個類中被訪問。
2. 成員作用域（Member Scope）：指在類的成員方法中定義的變數，它們只能在該方法中被訪問。
3. 塊作用域（Block Scope）：指在花括號（{}）中定義的變數，它們只能在該花括號中被訪問。
4. 局部作用域（Local Scope）：指在方法中定義的變數，它們只能在該方法中被訪問。

* 在 Java 中，變數的作用域由大到小依次是：類作用域 > 成員作用域 > 块作用域 > 局部作用域。
    * 在一個較小的作用域中可以定義同名的變數，它們互相獨立且不會相互影響。如果在較小的作用域中定義了與較大的作用域中定義的變數同名的變數，則較小作用域中的變數將覆蓋較大作用域中的變數，直到離開該作用域為止。