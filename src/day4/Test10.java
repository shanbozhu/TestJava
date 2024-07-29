package day4;

public class Test10 {
    public static void main(String[] args) {
        label1: for (int x = 0; x < 5; x++) {
            for (int y = 5; y > 0; y--) {
                if (y == x) {
                    continue label1; // 继续外层的下次循环
                }
                System.out.println(x + "," + y);
            }
        }
        System.out.println("Game Over!");
    }
}
