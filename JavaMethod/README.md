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
