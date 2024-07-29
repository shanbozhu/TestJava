package day4;

public class Test2 {
    public static void main(String[] args) {
        int aa;
        aa = 5;

        int result = 1;
        int number = 1;
        for (; number <= 5; number++) {
            result *= number;
        }
        System.out.println("5 的阶乘结果是：" + result); // 输出"5的阶乘结果是：120"
        System.out.print("number结果是：" + number);
    }
}
