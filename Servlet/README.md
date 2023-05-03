## Servlet
Servlet是Java Web應用程式的基礎組件之一，用於處理HTTP請求和生成HTTP響應。Servlet運行在Web容器中，當Web容器接收到HTTP請求時，就會根據Servlet的URL映射路徑來選擇適當的Servlet進行處理。   


### 1. MakeFirstServlet
1. 創建一個 Java 程序，並將其保存在網站的 /WEB-INF/classes 目錄下。
2. 實現 javax.servlet.Servlet 接口。
    1. 創建一個Java類別，並繼承javax.servlet.http.HttpServlet類別。
    2. 重寫HttpServlet類別中的doGet或doPost方法，這兩個方法都是處理HTTP請求的方法。
    3. 為Servlet類別添加@WebServlet註解，設置Servlet的URL映射路徑。
    4. 將Servlet類別編譯成.class文件，然後將它部署到Web容器中。
3. 在 web.xml 文件中定義 Servlet。

### 2. LifeCycle
在Java Web開發中，Servlet是一種特殊的Java類別，用於處理HTTP請求。當Web容器（例如Tomcat或Jetty）收到HTTP請求時，它會根據URL映射找到相應的Servlet並調用其方法來處理請求。Servlet的生命週期可以分為以下三個階段：
1. 初始化階段（Initialization）：  
    當Web容器第一次創建Servlet時，它會調用Servlet的初始化方法（init()）。在初始化階段中，Servlet可以執行任何必要的準備工作，例如讀取配置文件、連接數據庫等等。
2. 服務階段（Service）：
    當Web容器收到HTTP請求時，它會根據URL映射找到相應的Servlet並調用其服務方法（service()）來處理請求。在服務階段中，Servlet可以從HTTP請求中獲取相關信息，例如請求方法、請求參數等等，並可以向HTTP響應中添加內容。
3. 終止階段（Termination）：
    當Web容器需要終止Servlet時，它會調用Servlet的銷毀方法（destroy()）。在銷毀方法中，Servlet可以執行任何必要的清理工作，例如釋放資源、關閉數據庫連接等等。