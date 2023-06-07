public class ReturnKey {

    public void returnTest() {
        System.out.println("This is returnTest");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 5) {
                    return;
                }
                System.out.println(i + " " + j);
            }
        }
    }

    public void breakTest() {
        System.out.println("This is breakTest");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 5) {
                    break;
                }
                System.out.println(i + " " + j);
            }
        }
    }

    public int testing(int i) {
        if (i == 3) {
            return 3;
        } else {
            return 5;
        }
    }

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        ReturnKey m = new ReturnKey();
        
        // 呼叫 add 方法計算 x 和 y 的值
        int x = m.add(2, 6);
        int y = m.add(5, 88);
        
        // 印出 x 和 y 相加的結果
        System.out.println(m.add(x, y));
        
        // 呼叫 returnTest 方法，因為在內部的循環中遇到 return，所以方法被中斷並結束執行
        m.returnTest();
        
        // 呼叫 breakTest 方法，因為在內部的循環中遇到 break，所以內部循環被中斷，但方法繼續執行
        m.breakTest();
        
        // 呼叫 testing 方法，傳入參數 3，返回 3
        System.out.println(m.testing(3));
    }
}
