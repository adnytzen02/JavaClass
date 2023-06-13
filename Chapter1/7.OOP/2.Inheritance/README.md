### 2. Inheritance

在這個程式中，我們建立了四個類別：`Person`、`Teacher`、`Student` 和 `Main`。

`Person` 類別代表一個人，包含姓名、年齡和地址等屬性，以及走路和睡覺等動作。

`Teacher` 類別繼承自 `Person`，並添加了教授的科目屬性。它也具備走路的動作，並且新增了教授科目的動作 `teach()`。

`Student` 類別也繼承自 `Person`，並添加了成績屬性。它也具備走路的動作，並且新增了學習的動作 `learning()`。

在 `Main` 類別中，我們創建了一位名為 "Kite"、年齡為 25 歲、住在台北的老師 `teacher1`，教授的科目是 Java。我們也創建了一位名為 "Alex"、年齡為 16 歲、住在台北的學生 `student1`，成績為 87。

最後，我們呼叫 `student1.learning()` 來執行學生的學習動作，並呼

叫 `teacher1.walk()` 來執行老師的走路動作。