## Method


### Method (方法)
方法（Method）是一段可重複使用的程式碼塊，用於執行特定的任務或操作。方法可以接受輸入參數，並可能返回一個值。

以下是定義一個方法的基本語法：   
```js
Modifier Return Type Method Name(Parameter List) {
    // 方法的程式碼
    // 可以包含多條語句
    // 可以使用傳入的參數
    // 可能會返回一個值
}
```
* 修飾符（Modifier）：指定方法的可見性和行為，例如public表示公共方法，private表示私有方法。
* 返回值類型（Return Type）：指定方法返回的數據類型，可以是基本數據類型（如int、double）、對象類型或void（表示方法不返回任何值）。
* 方法名稱（Method Name）：指定方法的名稱，用於在其他地方調用該方法。
* 參數列表（Parameter List）：指定方法接受的輸入參數，可以是零個或多個參數，每個參數包括類型和名稱。

### 1. MyMethod
這個程式示範了一個包含兩個方法的類別 Main。sayHello 方法用於印出 "Hello"，add 方法用於計算兩個整數的和。   

* 在 main 方法中，建立了一個 Main 物件 m，然後依序呼叫 m 的 sayHello 方法和 add 方法，並將 add 方法的結果印出來。   

    * 執行程式時，會印出 "Hello" 和計算結果 3。   

### Return Keyword
在Java中，`return`是一個關鍵字，用於在方法中返回值或提前結束方法的執行。   

1. 返回值：
在方法定義中，可以指定方法的返回值類型，例如`int`、`double`、`String`等等。使用`return`關鍵字，可以將計算結果或其他需要返回的值返回給調用該方法的地方。   

以下是一個計算兩個數字和的方法的例子，並返回結果：    

```java
public int sum(int a, int b) {
    int result = a + b;
    return result;
}
```  
      
在這個例子中，`return result;`語句將計算結果`result`返回給調用該方法的地方。   

2. 提前結束方法執行：    
`return`關鍵字也可以用於提前結束方法的執行，即使方法的所有語句還沒有執行完畢。在遇到`return`語句後，方法將立即結束並返回到調用該方法的地方。    

以下是一個示例，當滿足特定條件時，提前結束方法的執行：    

```java
public void printNumber(int number) {
    if (number < 0) {
        System.out.println("Number is negative.");
        return; // 提前結束方法執行
    }
    
    System.out.println("Number is positive.");
    // 其他程式碼...
}
```

在這個例子中，如果傳入的數字`number`小於0，方法會打印一個消息並立即結束執行。如果數字大於等於0，則會繼續執行後面的程式碼。    

使用`return`關鍵字可以根據需要在方法中返回值或提前結束方法的執行。請注意，在`void`方法中，可以使用`return`來提前結束方法的執行，但是不會返回任何值。    

### 2. ReturnKey
這個程式示範了在 Java 中 return 和 break 的使用。    
      
1. 在 returnTest 方法中，兩層循環內部如果 j 的值等於 5，則會執行 return 語句，整個方法被中斷並結束執行。
        
2. 在 breakTest 方法中，兩層循環內部如果 j 的值等於 5，則會執行 break 語句，內部循環被中斷，但整個方法繼續執行。
       
3. 在 main 方法中，示範了如何使用 return 中斷方法的執行和使用 break 中斷循環的執行。    
       
* 此外，還有一個 testing 方法，根據傳入的參數值返回不同的結果。在 main 方法中，呼叫了這個方法並印出返回值。    


### Method Overloading
在Java中，方法重載（Method Overloading）是指在同一個類中定義多個具有相同名稱但參數列表不同的方法。    

* 方法重載的特點是：

    * 方法名稱相同：重載的方法擁有相同的名稱，這樣可以方便開發者記憶和使用。

    * 參數列表不同：重載的方法在參數列表上具有差異，可以是參數的數量、類型或順序。

    * 返回值類型可以相同也可以不同：方法重載與返回值類型無關，即使返回值類型不同，只要參數列表不同，仍然被視為重載的方法。

以下是一個使用方法重載的例子：    
```js
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
```


### 3. Method Overloading
在Java中，方法重載（Method Overloading）是指在同一個類中定義多個具有相同名稱但參數列表不同的方法。    

方法重載的特點是：

1. 方法名稱相同：重載的方法擁有相同的名稱，這樣可以方便開發者記憶和使用。
2. 參數列表不同：重載的方法在參數列表上具有差異，可以是參數的數量、類型或順序。
3. 返回值類型可以相同也可以不同：方法重載與返回值類型無關，即使返回值類型不同，只要參數列表不同，仍然被視為重載的方法。

這個程式示範了在 Java 中的方法重載（Overloading）。   

在 Main 類中，有兩個名為 sum 的方法，它們接受不同的參數類型：sum(int a, int b) 接受兩個整數參數，sum(double a, double b) 接受兩個浮點數參數。   