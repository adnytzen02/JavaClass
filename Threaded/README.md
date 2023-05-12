## multi-Threaded

Java 是一個支援多線程 (multi-threaded) 的語言，這代表著 Java 程序可以同時執行多個任務 (tasks)。   
在 Java 中，每個線程都是獨立運行的，擁有自己的堆棧空間，可以同時進行不同的操作。     

多線程的好處在於它可以使程序更加高效和靈活。   
當一個線程遇到耗時的任務時，其他線程可以繼續執行而不必等待該任務完成。   
這樣可以讓程序在相同的時間內完成更多的工作。   
此外，多線程也可以用於提高程序的可靠性，例如在一個線程出現異常或錯誤時，其他線程仍然可以繼續執行。   

### Thread Pool
Thread pool 是一個可以重複使用的執行緒集合，被用來執行任務。一旦建立了一個固定大小的 thread pool，便可以將任務提交到池中執行，這些任務將被分配給池中的某一個執行緒去執行，當任務執行完畢後，執行緒會被釋放回池中以供重複使用。這樣可以避免重複創建和銷毀執行緒的開銷，以及減少了同時運行的執行緒數量，從而提高了系統效能。   

* 執行語法
```js
// 建立大小為5的固定thread-pool
ExecutorService executor = Executors.newFixedThreadPool(5));

// 不再需要使用thread，可以通過 shutdown() 方法將其關閉。
executor.shutdown();
```

### Race Condition

