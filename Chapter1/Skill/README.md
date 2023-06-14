## Java Skill


### static context
在Java中，static是一個關鍵字，用於聲明類成員（字段、方法、代碼塊）為靜態成員。它也可以用於靜態內部類和靜態導入。        
        
static具有以下特點和行為：        
        
靜態成員屬於類本身，而不是類的實例。它們在類被加載時初始化，並且不需要類的實例即可訪問。        
        
靜態成員可以直接通過類名訪問，無需創建類的實例。    
        
靜態成員在內存中只有一份拷貝，被所有類的實例共享。      
        
靜態成員可以被類的所有實例訪問，也可以在類的靜態方法中訪問。        

### 1. StaticTest
這個程式示範了如何呼叫非靜態方法和靜態方法。     
       
在 Main 類中，有一個非靜態方法 sum 和一個靜態方法 sayHello。    

### 2. Exchange 
這個程式示範了如何交換兩個整數和兩個浮點數的值。          
在`main`方法中，我們呼叫了`exchange`方法，並傳入兩個整數參數。程式會執行 `exchange`方法，將兩個整數的值交換，然後輸出交換後的結果。         
      
在輸出結果中，首先輸出了交換後的兩個整數值。      

### Reference
在Java中，參考數據類型（Reference Data Type）也稱為引用類型，是用於存儲對象的數據類型。與基本數據類型（如整數、字符等）不同，參考數據類型存儲的是對對象的引用而不是實際的數據值。     
Java提供了一些內置的參考數據類型，包括：      
      
1. 類（Class）：類是一種用於創建對象的模板，可以定義屬性和方法。在Java中，類是參考數據類型，並且所有的類都是java.lang.Object類的子類。      
      
2. 陣列（Array）：陣列是一個固定大小的連續數據結構，可以存儲相同類型的元素。陣列也是參考數據類型，因為它存儲對陣列對象的引用。      
      
3. 接口（Interface）：接口定義了一組方法的契約，類可以實現這些接口來提供具體的實現。接口本身也是參考數據類型。      
      
4. 字符串（String）：字符串是一個不可變的字符序列，由java.lang.String類表示。字符串是參考數據類型，並且在Java中使用非常廣泛。      

### 3. Reference

這個程式展示了在 Java 中傳遞參數的方式以及對陣列的操作。      
     
在 `Main` 類中，我們定義了幾個方法：     
     
- `changeA` 方法接收一個整數參數 `x`，並將 `x` 的值設為 20。
- `testA` 方法創建一個整數變數 `a`，賦值為 10，然後呼叫 `changeA` 方法並將 `a` 的值傳入。最後輸出 `a` 的值。     
     
這個例子展示了方法中對傳入參數值的修改並不影響原始變數的值。
- `copyList` 方法創建一個整數陣列 `myArray1`，並將其複製到 `myArray2`。然後我們修改 `myArray1` 的第一個元素的值，並輸出兩個陣列的元素值。結果顯示這兩個陣列實際上指向同一個內存位置，因此修改其中一個陣列會影響到另一個陣列。
- `changeElement` 方法接收一個整數陣列 `arr`，將陣列的第一個元素的值設為 1000。在 `main` 方法中，我們創建一個整數陣列 `myArr1`，並呼叫 `changeElement` 方法將 `myArr1` 傳入作為參數。輸出 `myArr1` 的元素值，結果顯示修改了方法內的陣列會影響到原始的陣列。      

### 4. StringSkill
這個程式展示了字串的分割和子字串截取。      
      
splitStr 方法創建一個字串 s，並使用空格 " " 作為分隔符將 s 分割成字串陣列 myArr。然後使用 for-each 迴圈遍歷 myArr 的每個元素，並輸出每個元素。
subStr 方法創建一個字串 s，然後使用 substring 方法從索引 0 到索引 4 截取 s 的子字串（不包含索引 4）。最後輸出截取後的子字串。      

### 5. MathSkill
      
這個程式展示了使用 `Math` 類別中的一些常用數學函數。      
      
- `Math.max(x, y)` 返回 x 和 y 中的最大值。
- `Math.min(x, y)` 返回 x 和 y 中的最小值。
- `Math.floor(PI)` 返回小於或等於 PI 的最大整數。
- `Math.ceil(PI)` 返回大於或等於 PI 的最小整數。
- `Math.sqrt(y)` 返回 y 的平方根。
- `Math.pow(y, x)` 返回 y 的 x 次方。
- `Math.log(x)` 返回 x 的自然對數。
      
在 `main` 方法中，我們宣告了一個常數 PI，並對一些數字進行了不同的數學運算，並使用 `System.out.println` 輸出結果。      

### Recursion
在Java中，遞迴（Recursion）是一種方法調用自身的技術。它是一種常用的編程技巧，用於解決需要重複執行相同或相似任務的問題。      
      
遞迴函數通常包含兩個部分：      
      
1. 基本情況（Base Case）：這是一個終止遞迴的條件。當滿足基本情況時，遞迴函數將停止調用自身並返回結果。
2. 遞迴步驟（Recursive Step）：在遞迴步驟中，函數調用自身以解決規模更小的問題。通常，每次遞迴調用都會將問題的規模縮小，使其接近基本情況。


### 6. Recursion
這個程式使用遞迴方法 `printTimes` 來印出從指定次數開始倒數到 1 的過程。

- 如果傳入的次數 `i` 為 0，則直接返回，遞迴結束。
- 如果 `i` 不為 0，則先輸出當前次數。
- 接著遞迴呼叫 `printTimes(i - 1)`，將次數減1，繼續執行下一次的遞迴。
- 當遞迴返回後，再次輸出當前次數，顯示已完成的次數。
- 遞迴會持續執行到 `i` 為 0，即倒數到 1 的過程結束。

在 `main` 方法中，我們呼叫 `printTimes(10)`，以 10 為起始次數進行遞迴印出次數的過程。