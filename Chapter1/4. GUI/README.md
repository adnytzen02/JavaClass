## GUI （圖形使用者介面）

### GUI
GUI（圖形使用者介面）是用於創建視覺化應用程序的一種方式。Java提供了多種方式來創建GUI應用程序，其中最常用的方式是使用Java Swing和JavaFX庫。    
* Java Swing：Java Swing是Java提供的一個GUI工具包，用於創建桌面應用程序的視覺元素。它包含了各種組件（如按鈕、標籤、文本框、列表等）和佈局管理器（如FlowLayout、BorderLayout、GridBagLayout等），可以用於構建用戶界面。     
以下是一個使用Java Swing創建簡單視窗的例子：    
```js
import javax.swing.*;

public class MyGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First GUI");
        JButton button = new JButton("Click Me");
        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
```
創建了一個JFrame（視窗），並在其中添加了一個JButton（按鈕）。然後，我們設置了視窗的一些屬性，如標題和關閉操作。最後，通過調用pack()和setVisible(true)方法，我們顯示了該視窗。    

### 1. MyGUI
這個程式主要用於展示如何使用 Swing 建立一個簡單的視窗應用程式，並在視窗中繪製文字。你可以根據需求修改程式碼來建立更複雜的視窗介面和繪圖效果。    

