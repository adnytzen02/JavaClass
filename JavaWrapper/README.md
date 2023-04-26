## Wrapper Class

Wrapper Class 是 Java 中用來封裝基本資料類型 (primitive data type) 的類別。Java 提供了八種基本資料類型，分別為 boolean、char、byte、short、int、long、float、double，而每種基本資料類型都有相對應的 Wrapper Class：Boolean、Character、Byte、Short、Integer、Long、Float、Double。透過 Wrapper Class，可以將基本資料型別轉換為物件，並使用物件相關的方法。   

Wrapper Class 不僅可以將基本資料型別轉換為物件，也可以透過物件來存取基本資料型別的值。例如，將 int 型別的變數 i 包裝成 Integer 物件後，可以透過 Integer 物件的 intValue() 方法來取得 i 的值。   

另外，Wrapper Class 也提供了一些常用的方法，例如 parseInt() 可以將 String 轉換為 int，valueOf() 可以將 String 轉換為相對應的 Wrapper Class 物件。   


| Primitive Data Type | Wrapper Class |
| :---: | :---: |
| byte | Byte |
| short | Short |
| int | Integer |
| long | Long |
| float | Float |
| double | Double |
| boolean | Boolean |
| char | Character |