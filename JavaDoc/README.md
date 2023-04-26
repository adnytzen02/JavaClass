## JavaDoc

JavaDoc是Java中用於生成API文件的工具。它是一種非常有用的軟體開發工具，可從源代碼中提取註釋信息並生成HTML文件，提供詳細的API文檔和說明。JavaDoc中包括類、方法、變量等的說明文檔，它可以幫助其他開發人員快速了解和使用您的代碼，提高代碼可讀性和可維護性。JavaDoc在代碼文檔化和開發者文檔管理方面有著不可替代的重要性。

JavaDoc的註釋應該符合一定的格式，以便生成API文檔時可以正確地解析和顯示。通常，JavaDoc註釋以「/**」開始，以「*/」結束，並包括註釋內容和一些標籤，如@author、@param、@return等。

```js
/**
 * This is a sample class to demonstrate the use of JavaDoc comments.
 *
 * @author John Doe
 * @version 1.0
 */
public class MyClass {

    /**
     * This is a sample method to demonstrate the use of JavaDoc comments.
     *
     * @param arg1 The first argument
     * @param arg2 The second argument
     * @return The sum of arg1 and arg2
     */
    public int myMethod(int arg1, int arg2) {
        return arg1 + arg2;
    }

}
```

生成的API文檔將包含類名、構造函數、方法、變量等詳細的說明和用法示例。透過JavaDoc，開發人員可以更加輕鬆地理解代碼的功能、使用方式和限制，從而更好地編寫出高質量的代碼。

JavaDoc不僅僅是一種文檔生成工具，還是一個代碼設計工具。通過使用JavaDoc，開發人員可以更好地理解代碼的架構和設計，從而更好地編寫出高質量的代碼。它還可以幫助開發人員更好地進行代碼重構和代碼優化，從而提高代碼的可維護性和可擴展性。


### DocAPI
利用 IntelliJ IDE 製作 Java DOC