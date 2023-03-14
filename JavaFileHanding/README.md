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

