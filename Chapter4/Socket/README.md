## Socket Programming
Java提供了用於網絡通信的Socket類和ServerSocket類，它們位於java.net包中。Socket類用於實現客戶端和服務器之間的通信，而ServerSocket類用於在服務器端監聽和接受客戶端的連接。   

### Server and Client
描述了一個簡單的客戶端和伺服器之間的通信協議，客戶端將半徑值發送到伺服器，伺服器根據該值計算周長並將結果返回給客戶端。    

### MultiThread
改進了 1. firstServerClient_Server.java，使其能夠同時處理多個客戶端的請求。每當有新的客戶端連接，就會為該客戶端創建一個新的執行緒，該執行緒獨立運行，處理該客戶端的請求。這樣可以提高伺服器的效能和並發性能，使多個客戶端能夠同時連接和進行通信。   

### Sending Obj
 Circle.java 一個簡單的客戶端，用於將 Circle 物件發送給伺服器並接收伺服器的回應。   
 CircleServer.java 簡單的伺服器端，用於接收客戶端傳送的 Circle 物件，並回傳計算結果給客戶端。    
 實現 Serializable 介面，該類別可以被序列化，這使得它可以在網絡上進行傳輸或在檔案系統中保存。    