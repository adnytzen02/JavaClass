## Switch Statement

Java 中的 switch statement 是一種多重分支語句，可以使用它來取代較為繁瑣的 if-else if-else 串連判斷。   

switch 語句的基本結構如下：    
```js
switch (expression) {
    case value1:
        // 當 expression 為 value1 時要執行的程式碼
        break;
    case value2:
        // 當 expression 為 value2 時要執行的程式碼
        break;
    ...
    default:
        // 當 expression 不符合任何一個 case 時要執行的程式碼
        break;
}
```
expression 可以是 byte、short、int、char 或 String 等基本資料類型或列舉類型的變數或常數。   
每個 case 表示一個可能的值。如果 expression 等於某個 case 的值，則執行該 case 所對應的程式碼。   
如果沒有任何一個 case 與 expression 的值相等，則執行 default 標記所對應的程式碼。在每個 case 的程式碼區塊最後需要加上 break 關鍵字，以表示當該 case 的程式碼執行完畢後跳出 switch 語句。如果省略 break，則該 case 後面的所有 case 程式碼都會被執行，這種情況被稱為“落下（fall-through）”。   


* 範例
    製作一隻羊，可以用W/A/S/D 跟 方向鍵移動。