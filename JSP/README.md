## JSP
JSP（JavaServer Pages）是一種基於Java技術的網頁開發技術。JSP透過在HTML文件中嵌入Java程式碼，允許網頁開發人員輕鬆地訪問數據庫、創建用戶交互式網頁以及實現各種動態內容。這樣做不僅簡化了網頁開發的流程，而且還增加了網站的互動性和個性化。JSP的概念可以理解為是一種“動態HTML”技術，它使得動態生成HTML網頁變得更加簡單。在JSP中，開發人員可以使用Java程序訪問數據庫、提取信息並將其顯示在網頁上。JSP的工作方式是當JSP網頁被請求時，Web容器會把JSP編譯成Java Servlet，然後再運行Servlet以產生HTML內容，最終顯示在網頁上。總體而言，JSP是一種非常有用的網頁開發技術，可以提高網站的效率、可靠性和可擴展性。


### addUpto.jsp

* addUpTo.jsp   
    這是一個使用JSP技術的網頁，顯示了從1加到100的數字和，每行顯示一個結果。在這個JSP頁面中，使用了Java代碼塊和聲明區域。addUpTo()方法使用聲明區域定義，用於計算從1到傳入的整數n的總和。在for循環中，遍歷從1到100的整數，將每個整數傳遞給addUpTo()方法，並顯示結果。HTML標記用於構建頁面的基本結構。

### JSP_SQL

* JSP_SQL/book/BookServlet.java   
    這是一個用於查詢書籍信息的Servlet。該Servlet通過JDBC訪問數據庫中的book表，並根據用戶傳入的bookId進行查詢，並將查詢結果存儲在一個Book對象中，然後將Book對象作為請求屬性傳遞給book.jsp頁面進行展示。在初始化時，它設置了一個準備好的語句(preparedStatement)，該語句用於查詢book表中的書籍信息。該Servlet使用JDBC來訪問MySQL數據庫。


### Predefined Variable
JSP中的預定義變量是指在JSP網頁中預先定義好的變量，可直接在JSP頁面上使用，而不需要額外聲明或定義。這些變量由JSP容器提供，主要用於幫助開發者快速編寫JSP頁面。   

* 以下是一些常見的預定義變量：

1. request：代表HTTP請求的對象，可用於存取客戶端提交的參數。   

2. response：代表HTTP回應的對象，可用於向客戶端發送回應。   

3. session：代表HTTP會話的對象，可用於存取和管理用戶會話的相關資訊。   

4. application：代表Web應用程式的全域範圍，可用於存取和管理Web應用程式的相關資訊。   

5. out：代表JSP回應的輸出串流，可用於向客戶端發送回應。   

6. pageContext：代表當前JSP頁面的上下文，可用於存取和管理當前頁面的相關資訊。   

7. config：代表當前JSP頁面的配置，可用於存取和管理當前頁面的配置資訊。   

這些預定義變量可在JSP網頁中直接使用，不需要額外聲明或初始化。例如，可以使用request.getParameter("name")來獲取HTTP請求中名為"name"的參數，或使用out.println("Hello, World!")向客戶端發送回應。   


### Directive
JSP Directive是用於指示JSP容器的指令，可以用來控制JSP頁面的編譯和執行。   
它們以"<%"開頭，以"%>"結尾，可以放置在JSP頁面的任何地方，但是只有在JSP頁面的開頭才有效。   
JSP Directive包含三種類型：   
    1. page directive：用於設置JSP頁面的屬性，如頁面的語言，編碼方式，session屬性等。   

    2. include directive：用於將其他JSP頁面或HTML頁面包含在當前頁面中。   

    3. taglib directive：用於設置JSP應用程序使用的標籤庫。   


### JavaBeans
JSP JavaBeans 是指一種Java類別，用於封裝數據並提供訪問方法，通常用於Web應用程序中的模型層。   
在JSP頁面中，可以使用JSP標記庫或JSP自定義標記來訪問和顯示JavaBean中的數據。使用JavaBeans可以實現Web應用程序中的MVC（模型-視圖-控制器）模式，並使代碼更加可維護和可重用。   
要創建JavaBeans，必須遵循命名和設計模式，   
例如命名屬性必須以小寫字母開頭，使用getter和setter方法來訪問屬性，並實現Serializable接口以實現對象的序列化。通過在JSP頁面中使用JavaBeans，我們可以使代碼更加清晰、可維護和易於擴展。   
