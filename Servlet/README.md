## Servlet

Servlet是Java Web應用程式的基礎組件之一，用於處理HTTP請求和生成HTTP響應。Servlet運行在Web容器中，當Web容器接收到HTTP請求時，就會根據Servlet的URL映射路徑來選擇適當的Servlet進行處理。   
     
Servlet是一個Java類別，必須繼承javax.servlet.http.HttpServlet類別。Servlet類別可以重寫doGet、doPost、doPut等方法來處理HTTP請求。Servlet可以通過HttpServletRequest對象獲取請求信息，例如請求URL、請求參數、HTTP標頭等等。Servlet可以通過HttpServletResponse對象生成HTTP響應，例如設置HTTP標頭、寫入響應內容等等。   

Servlet可以通過初始化參數和上下文參數來設置配置資訊。初始化參數定義在web.xml檔案或@WebServlet註解中，是Servlet的特定參數。上下文參數是Web應用程式的全域參數，可以在web.xml檔案中定義。   

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

### 3. GetRequest

Get Request是一種HTTP請求方法，用於從伺服器檢索數據。它是HTTP協議的一部分，用於在Web瀏覽器和伺服器之間交換數據。

使用GET請求時，瀏覽器將URL和請求參數發送到伺服器。伺服器使用這些參數來生成回應並將其發送回瀏覽器。 GET請求通常用於檢索數據並在瀏覽器中顯示結果。

在Servlet中，您可以通過覆蓋doGet()方法來處理GET請求。當瀏覽器向Servlet發出GET請求時，容器將調用doGet()方法，並將HttpServletRequest對象和HttpServletResponse對象作為參數傳遞給它。您可以使用這些對象來檢索請求參數並向客戶端發送回應。

### 4. PostRequest

「POST」請求是一種用於向指定資源提交要處理的實體數據的HTTP請求方法。與「GET」請求不同，「POST」請求不會直接返回所請求的數據。而是會將請求數據提交到伺服器端，並由伺服器端進行處理，通常用於提交表單或上傳檔案等操作。在Servlet中，可以通過doPost方法來處理POST請求。   

* PostFormServlet.java
使用 PostRequest 方法，通過 PostFormServlet.java 新增書本編號、名稱、價錢、作者等資料，然後上傳至 mysql。   
相較於 GET 請求方法，POST 請求方法更加安全可靠。在 GET 方法中，所有的請求參數都是顯示在 URL 上的，因此可能會被其他人輕鬆地窺探到請求參數，進而造成數據泄露的風險。而在 POST 方法中，所有的請求參數都是隱藏在 HTTP 請求主體中的，因此更加安全可靠。

### ５. Cookies
Cookies（中文稱作「網路甜點」）是一種存儲在用戶端瀏覽器中的小型數據文件，用於在伺服器和客戶端之間傳遞資料。通常用於實現網站的身份驗證、記住用戶喜好、購物車等功能。當伺服器向客戶端發送響應時，可以在HTTP標頭中添加Set-Cookie欄位，告訴瀏覽器存儲Cookie。瀏覽器在後續的請求中會自動將Cookie帶上，放在HTTP請求頭中的Cookie欄位中，傳送到伺服器端。在Servlet中，可以使用HttpServletRequest和HttpServletResponse對象的方法來設置、讀取和刪除Cookie。   

*  Cookies/myCode/CookieServlet.java    
    這是一個使用 Java Servlet 和 MySQL 資料庫的簡單範例。當使用者 GET 該 Servlet 時，會收到一組 HTML 表單，使用者填寫表單後，點選「Confirm」按鈕時，資料會被存到 Cookie 裡，之後使用者 POST 該 Servlet 時，Servlet 會讀取 Cookie 裡的資料，然後把資料存到 MySQL 資料庫中。

    在 Servlet 初始化時，我們載入了 MySQL JDBC Driver，建立了資料庫連線，並設定 Prepared Statement 指令。在 POST 時，我們使用了 Prepared Statement 參數，然後執行了 SQL INSERT 指令。

    在 doGet 方法中，我們使用 request.getParameter 方法獲取表單資料，然後存到 Cookie 裡，並回應一個 HTML 表單給使用者。在 doPost 方法中，我們使用 request.getCookies 方法讀取 Cookie 裡的資料，然後存到 MySQL 資料庫中。

### 6. Session
Session（會話）是指在客戶端（如網頁瀏覽器）與伺服器之間建立的一種持久化的網路協議，用於在一系列HTTP請求與回應之間維護狀態。在一次會話中，客戶端與伺服器之間可以互相傳遞資訊，並且保持這些資訊的狀態，使得連續的請求能夠擁有同樣的狀態。在網路應用開發中，Session可以用於記錄用戶的登入狀態、購物車內容、個人化設定等信息。Session通常由伺服器端管理，可以使用各種不同的技術和存儲方式實現。

* 

