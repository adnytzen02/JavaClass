## 增加資料庫的連接

* 為了在Java中連接資料庫，需要使用Java Database Connectivity (JDBC) API。
    * JDBC允許Java應用程序與各種關係型資料庫進行通信，包括MySQL、Oracle、Microsoft SQL Server等。

1. 下載並安裝MySQL Connector/J JDBC驅動程式。您可以在下面的鏈接中下載驅動程式：
https://dev.mysql.com/downloads/connector/j/
2. 創建一個MySQL資料庫，其中包括用戶表。用戶表至少應包含username和password列。

### Login.java
這個Login類別將連接到名為mydatabase的MySQL資料庫。   
需要使用自己的資料庫名稱、用戶名和密碼來替換連接字符串中的值。   

在login()方法中，使用PreparedStatement物件準備了一個SQL查詢，並使用用戶輸入的用戶名和密碼作為參數化值。   
然後，執行查詢並檢查結果集是否包含任何行。   
如果找到了匹配的行，我們顯示“登錄成功”的消息。   
否則，我們顯示“用戶名或密碼不正確”的消息。   

結束使用資料庫後，添加了一個close()方法來關閉資料庫連接。   

### Main.java
在這個Main類別中，使用Scanner讓用戶輸入用戶名和密碼，   
然後創建一個Login對象並調用login()方法來進行驗證。   
最後，我們調用close()方法來關閉資料庫連接。   

為了使這個示例正常運作，需要在運行Main類別之前啟動MySQL資料庫伺服器。   

### mydatabase.sql
1. 需要安裝並啟動MySQL資料庫伺服器。從MySQL官方網站下載MySQL Community Server，並按照官方文檔中的步驟進行安裝和設置。
2. 需要使用MySQL命令行工具或其他可視化工具（如MySQL Workbench）登錄到MySQL伺服器。
3. 在MySQL命令行工具中，使用命令創建一個名為mydatabase的新資料庫：
```js
CREATE DATABASE mydatabase;
```
4. 選擇剛剛創建的資料庫：
```js
USE mydatabase;
```
5. 創建一個名為users的用戶表，包含username和password列
```js
CREATE TABLE users (
  id INT PRIMARY KEY AUTO_INCREMENT,
  username VARCHAR(50) NOT NULL,
  password VARCHAR(50) NOT NULL
);
```
使用INT數據類型定義了一個名為id的自動增量主鍵列，這個列將在每次插入新用戶時自動生成一個新的唯一ID。   
定義了兩個VARCHAR列來存儲用戶名和密碼，並使用NOT NULL限制來確保這些列中不會有空值。   

