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


###  DataType
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

### String Operation
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
