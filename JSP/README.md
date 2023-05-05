## JSP
JSP（JavaServer Pages）是一種基於Java技術的網頁開發技術。JSP透過在HTML文件中嵌入Java程式碼，允許網頁開發人員輕鬆地訪問數據庫、創建用戶交互式網頁以及實現各種動態內容。這樣做不僅簡化了網頁開發的流程，而且還增加了網站的互動性和個性化。JSP的概念可以理解為是一種“動態HTML”技術，它使得動態生成HTML網頁變得更加簡單。在JSP中，開發人員可以使用Java程序訪問數據庫、提取信息並將其顯示在網頁上。JSP的工作方式是當JSP網頁被請求時，Web容器會把JSP編譯成Java Servlet，然後再運行Servlet以產生HTML內容，最終顯示在網頁上。總體而言，JSP是一種非常有用的網頁開發技術，可以提高網站的效率、可靠性和可擴展性。


### addUpto.jsp

* addUpTo.jsp   
    這是一個使用JSP技術的網頁，顯示了從1加到100的數字和，每行顯示一個結果。在這個JSP頁面中，使用了Java代碼塊和聲明區域。addUpTo()方法使用聲明區域定義，用於計算從1到傳入的整數n的總和。在for循環中，遍歷從1到100的整數，將每個整數傳遞給addUpTo()方法，並顯示結果。HTML標記用於構建頁面的基本結構。

### JSP_SQL

* JSP_SQL/book/BookServlet.java   
    這是一個用於查詢書籍信息的Servlet。該Servlet通過JDBC訪問數據庫中的book表，並根據用戶傳入的bookId進行查詢，並將查詢結果存儲在一個Book對象中，然後將Book對象作為請求屬性傳遞給book.jsp頁面進行展示。在初始化時，它設置了一個準備好的語句(preparedStatement)，該語句用於查詢book表中的書籍信息。該Servlet使用JDBC來訪問MySQL數據庫。