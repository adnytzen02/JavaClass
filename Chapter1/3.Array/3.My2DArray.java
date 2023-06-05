public class My2DArray {
    public static void main(String[] args) {
        int[][] my2Darray = new int[3][2]; // 創建一個3行2列的二維整數陣列
        int value = 0; // 初始值為0

        my2Darray[2][1] = 12; // 將第3行第2列的元素設置為12
        my2Darray[0][1] = 24; // 將第1行第2列的元素設置為24

        // 使用雙重迴圈對二維陣列進行初始化
        for (int i = 0; i < my2Darray.length; i++) {
            for (int j = 0; j < my2Darray[i].length; j++) {
                my2Darray[i][j] = value; // 將陣列元素設置為目前的value值
                value++; // 每次迴圈結束後，value加1
            }
        }
    }
}
