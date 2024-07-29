package day4;

public class Test8 {
    public static void main(String[] args) {
        label: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.println(j);
                if (j % 2 != 0) {
                    break label; // 跳出外层循环
                }
            }
        }
    }
}
