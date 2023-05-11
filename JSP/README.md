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
在JSP中，JavaBean是指一個包含私有變數、公有Setter和Getter方法的類別。這些類別可以在JSP中使用，讓你可以儲存資料並在頁面中顯示或操作。   
為了讓JSP能夠使用JavaBean，你需要先在JSP中使用useBean指令，並在其中設置JavaBean的屬性。一旦JavaBean被初始化，你就可以在JSP中使用它。   

#### application
Application Scope是JSP中的一個儲存資料的方式，它是指將資料儲存到整個應用程式中。   
使用Application Scope，你可以將JavaBean物件儲存在整個應用程式中，這樣所有的JSP頁面都可以訪問該物件。   
```js
<jsp:useBean id="myBean" class="myPackage.MyBean" scope="application"/>
```

#### session

session是一個用於存儲和檢索與特定客戶端（瀏覽器）關聯的數據的機制。通過將對象存儲在session中，可以在整個Web應用程序中跨多個頁面共享數據。   
假設有一個JavaBean名為"User"，具有屬性username和password，並且想要在JSP頁面之間共享該物件，可以在JSP頁面中使用以下程式碼：   
```js
<%-- 宣告使用JavaBean --%>
<jsp:useBean id="user" class="myPackage.User" scope="session"/>

<%-- 設定JavaBean的屬性 --%>
<jsp:setProperty name="user" property="username" value="myUsername"/>
<jsp:setProperty name="user" property="password" value="myPassword"/>
```
其他JSP頁面中，可以再次使用上面的程式碼來存取和使用session中的JavaBean，例如：   
```js
<%-- 宣告使用JavaBean --%>
<jsp:useBean id="user" class="myPackage.User" scope="session"/>

<%-- 取得JavaBean的屬性 --%>
<%= user.getUsername() %>
<%= user.getPassword() %>
```
透過session中的JavaBean，JSP頁面之間可以共享資料，並且可以在不同的請求之間保留資料，這在某些應用中非常有用。   
#### page
JSP的JavaBean還可以在頁面（page）範圍內使用。   
這意味著，在同一頁面內的JSP元素中可以共享JavaBean。   
這樣，您可以在同一頁面的多個區域內使用相同的JavaBean對象。   
如果在頁面範圍中設置JavaBean，則只能在當前JSP頁面中訪問它。   

```js
<%@ page import="com.example.JavaBean" %>
<html>
  <head>
    <title>Page-scoped JavaBean Example</title>
  </head>
  <body>
    <jsp:useBean id="myBean" class="com.example.JavaBean" scope="page"/>
    
    <h2>Welcome to my page</h2>
    <p>My JavaBean's name is <jsp:getProperty name="myBean" property="name"/></p>
    
    <%-- Other JSP elements that use the same JavaBean instance --%>
    
  </body>
</html>

```