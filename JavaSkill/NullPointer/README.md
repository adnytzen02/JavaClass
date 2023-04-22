## NullPointer

Java的NullPointerException（空指針異常）是當一個對象被要求執行某個操作，但實際上該對象的值為空（即null）時，所觸發的運行時異常。這個異常通常表示代碼中的錯誤或疏漏，需要對代碼進行調試和修復。   

當出現NullPointerException時，通常會顯示錯誤堆棧跟踪（stack trace），其中包含了引起異常的方法和行數等詳細信息，可以幫助開發人員定位和解決問題。在避免NullPointerException方面，開發人員應該遵循良好的代碼編寫實踐，如在使用對象之前進行null檢查，或者使用Java 8引入的Optional類型等機制。   

例如，以下程式中的字符串變量 str 被初始化為 null :   
```js
String str = null;
```
嘗試使用該變量調用方法或訪問成員變量，就會拋出 NullPointerException異常，例如：   
```js
str.length();  // throws NullPointerException
```
為了避免NullPointer異常，可以在使用變量之前檢查它是否為null。例如：
```js
if ( str != null ) {
    str.length();
}
```
* 確保只有在變量不為 null 時才會調用方法或訪問成員變量。