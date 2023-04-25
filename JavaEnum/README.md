## Enum

Enum，全名為Enumeration（列舉），是一種特殊的資料型態，可以用來定義一些常數。它是一個有限集合的值，這些值在程式執行期間是固定的，且不能修改。它可以用來增加程式的可讀性和可維護性，也可以減少出錯的可能性。   

在 Java 中，使用 enum 關鍵字來定義一個枚舉類型。每個枚舉常數都是該類型的一個實例，使用時可以像常量一樣使用。常見的使用方式包括：   

1. 定義顏色、星期幾等常數。
2. 定義一些固定的選項，例如性別、飲食偏好等。
3. 定義一些狀態，例如應用程式的不同狀態。
下面是一個簡單的枚舉類型的範例：   
```js
public enum DayOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}
```
   
* 使用方式：
```js
DayOfWeek day = DayOfWeek.MONDAY;
if (day == DayOfWeek.MONDAY) {
    System.out.println("Today is Monday");
}
```
#### 此外，枚舉類型也可以擁有自己的方法，讓它們更加靈活。