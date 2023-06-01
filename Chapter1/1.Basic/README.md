## Basic Grammar  JAVA的基本語法


### Class 規則
1. Class 名稱一定要跟文件名稱相同
2. Class 名稱一定要大寫英文當作開頭
3. public static void main(String[] args) {}，在Java程式中，main方法是程式的進入點，它是程式執行時的起始位置。程式從main方法開始執行，並且可以在該方法中撰寫程式碼來執行各種操作。   

### Variable and Assignment
變數是用來存儲數據的容器。可以將變數想象成一個具有名稱的儲存位置，用於保存數據值。在Java中，定義變數時需要指定其類型，並且可以為其賦予初始值。    
變數的定義格式如下：    
```js
<類型> <變數名稱> = <值>;
```
例如：    
```js
int age = 25;
```
上述代碼同時聲明了一個整數型的變數age並賦予了初始值25。   

注意的是，Java是一種靜態類型語言，這意味著變數在使用前必須聲明其類型。一旦變數聲明了類型，則該變數只能存儲該類型的值，不能存儲其他類型的值。    

### Vairable 規則
變數名稱可以由英文、數字、底線以及 $ 作為開頭，不能由數字當開頭。    
但變數名稱也不能為 Java 的關鍵字。   



###  數據類型 (DataType)
原始數據類型用於存儲基本的數值類型，而引用數據類型用於存儲對象的引用。引用數據類型需要使用關鍵字new來創建對象，並且可以訪問對象的屬性和方法。

以下是一些例子：
```js
// 原始數據類型
byte age = 25;
int count = 100;
double pi = 3.14159;
char grade = 'A';
boolean isStudent = true;

// 引用數據類型
String name = "John Smith";
int[] numbers = {1, 2, 3, 4, 5};
```
Java還提供了自動拆箱（Autoboxing）和自動裝箱（Autounboxing）的功能，使得原始數據類型和對應的包裝類型之間可以進行自動轉換，方便開發者操作數據。    



### 字串操作 (String Operation)
字串操作（String Operations）是指在Java中對字串（String）進行各種操作的過程。Java提供了豐富的內建方法和運算符，可以對字串進行拼接、查找、替換、分割等操作。
1. 字串拼接（String Concatenation）：使用+運算符可以將兩個字串連接起來。   
```js
String str1 = "Hello";
String str2 = "World";
String result = str1 + " " + str2;  // "Hello World"
```
2. 字串長度（String Length）：使用length()方法可以獲取字串的長度。   
```js
String str = "Hello";
int index = str.length();  // 5
```
3. 字串查找（String Searching）：使用indexOf()方法可以查找字串中特定字符或子字串的位置。   
```js
String str = "Hello World";
int index = str.indexOf("World");  // 6
```



### 關係運算符（Relational Operators） & 條件運算符（Conditional Operators）
在Java中，關係運算符（Relational Operators）和條件運算符（Conditional Operators）用於比較和判斷數值或表達式的結果。這些運算符常用於條件語句和迴圈中，以根據特定條件執行不同的操作。

以下是Java中常見的關係運算符：

- `==`：等於，用於比較兩個值是否相等。
- `!=`：不等於，用於比較兩個值是否不相等。
- `>`：大於，用於判斷左邊的值是否大於右邊的值。
- `<`：小於，用於判斷左邊的值是否小於右邊的值。
- `>=`：大於等於，用於判斷左邊的值是否大於等於右邊的值。
- `<=`：小於等於，用於判斷左邊的值是否小於等於右邊的值。

關係運算符返回的結果是一個布爾值，即`true`或`false`。

以下是Java中常見的條件運算符：

- `&&`：邏輯與（AND），用於判斷多個條件是否同時成立。
- `||`：邏輯或（OR），用於判斷多個條件是否至少有一個成立。
- `!`：邏輯非（NOT），用於對一個條件的結果進行取反。

條件運算符在條件語句（如`if`語句、`while`迴圈等）中常用於組合多個條件，以便根據特定的條件執行不同的程式碼塊。

以下是一些例子：

```java
int x = 5;
int y = 10;

boolean isEqual = (x == y);  // false
boolean isGreater = (x > y);  // false
boolean isLessThanOrEqual = (x <= y);  // true

boolean condition1 = (x > 0) && (y < 20);  // true
boolean condition2 = (x > 0) || (y > 20);  // true
boolean condition3 = !(x > 0);  // false
```

在使用條件運算符時，需要注意運算符的優先級和括號的使用，以確保表達式的求值符合預期。



#### = 、 == 差別
= 和 == 是兩個不同的運算符，它們具有不同的功能和用途。

1. =（賦值運算符）：
    用於將右邊的值賦給左邊的變量。    
    例如：int x = 5; 表示將數值 5 賦值給變量 x。    

2. ==（相等運算符）：
    用於比較兩個值是否相等。   
    返回布爾值，即 true 或 false。   
    例如：int x = 5; int y = 5; boolean result = (x == y); 結果是 true，因為 x 和 y 的值相等。   
在判斷相等性時，我們應該使用 == 運算符，而不是 = 運算符。以下是一個示例：   
```js
int x = 5;
int y = 10;

if (x == y) {
    System.out.println("x and y are equal");
} else {
    System.out.println("x and y are not equal");
}
```
要注意的是，== 運算符在比較引用數據類型（如對象）時，比較的是兩個對象的引用是否相等，而不是內容是否相等。如果需要比較對象的內容是否相等，則需要使用對應的方法（如 equals() 方法）進行比較。    



### 算術運算符（Arithmetic Operators）
在Java中，算術運算符（Arithmetic Operators）用於執行數學運算，包括加法、減法、乘法、除法和取餘等操作。下面是Java中常見的算術運算符：   
1. 加法（Addition）：用+表示，將兩個數值相加。
2. 減法（Subtraction）：用-表示，將右邊的數值減去左邊的數值。
3. 乘法（Multiplication）：用*表示，將兩個數值相乘。
4. 除法（Division）：用/表示，將左邊的數值除以右邊的數值。如果兩個操作數都是整數，則結果將被截斷為整數（去掉小數部分）。   
5. 取餘（Modulus）：用%表示，計算左邊的數值除以右邊的數值的餘數。
6. 自增（Increment）：用++表示，將變量的值增加1。
7. 自減（Decrement）：用--表示，將變量的值減少1。
```js
        int sum = 5 + 3;  // 8
        int difference = 7 - 2;  // 5
        int product = 4 * 3;  // 12
        int quotient = 10 / 3;  // 3
        int remainder = 10 % 3;  // 1
        int x = 5;
        x++;  // x的值變為6
        int y = 8;
        y--;  // y的值變為7
```
8. 使用括號來控制運算的優先級。
```js
int result = (4 + 2) * 3;  // 18
```