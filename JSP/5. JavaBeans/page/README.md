## page

### 程式功能
這段程式碼是一個訪客計數器，用於跟蹤訪問網頁的人數。    
Counter類別包含一個計數器變量和一個增加計數器的方法，JSP頁面使用useBean指令實例化Counter對象，然後在其中使用scriptlet代碼調用increaseCount()方法增加計數器，最後使用expression語法顯示計數器的值。    
這種技術通常用於簡單的網頁統計和分析。   