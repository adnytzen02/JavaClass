## 封裝 ( Encapsulation )

封裝（Encapsulation）是面向對象編程中的一個重要概念，它指的是將物件的內部狀態和行為隱藏起來，只對外部提供必要的接口和方法來訪問和操作物件。

1. 封裝的目的是保護物件的內部狀態和實現細節，同時提供必要的公開方法和接口來操作和訪問物件。
2. 封裝通常是通過類別設計和存取修飾符來實現的，使用 private、protected 和 public 存取修飾符來限制對物件的訪問和操作。
3. 在設計類別時，應該將物件的內部狀態和行為定義在類別內部，使用 private 修飾符來限制訪問，只提供必要的公開方法和接口來操作和訪問物件。
4. 封裝可以提高程式的可靠性、安全性和可維護性，防止外部程式訪問和修改物件的內部狀態，從而減少程式出錯的概率，提高程式的穩定性和安全性。
5. 封裝可以隱藏物件的實現細節，使外部程式只需要知道如何使用物件，而不需要知道物件的內部實現細節，從而提高程式的抽象性和可讀性。
6. 設計公開方法和接口時，應該考慮方法的參數、返回值和異常處理等方面，確保方法的正確性、可靠性和安全性，並且應該提供適當的文檔和示例來描述方法的功能和使用方法。

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