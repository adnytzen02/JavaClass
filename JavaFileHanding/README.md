## Java 文件

文件處理是任何應用程序的重要組成部分。

Java 有多種創建、讀取、更新和刪除文件的方法。

### Java 文件處理
File 包中的 class 允許 java.io 使用文件。   
要使用該類 File，創建該類的對象，並指定文件名或目錄名。

```js
import java.io.File;  // import the File class
File myObj = new File("filename.txt"); // Specify the filename
```

### File有許多用於創建和文件信息的有用方法
|Method|Type|Description|
|:---:|:---:|:---:|
|canRead()|Boolean|測試文件是否可讀|
|canWrite()|Boolean|測試文件是否可寫|
|createNewFile()|Boolean|創建一個空文件|
|delete()|Boolean|刪除文件|
|exists()|Boolean|測試文件是否存在|
|getName()|String|返回文件的名稱|
|getAbsolutePath()|String|返回文件的絕對路徑名|
|length()|Long|回傳檔案的大小（以位元組為單位）。|
|list()|String[]|回傳目錄中檔案的陣列。|
|mkdir()|Boolean|建立一個目錄|
