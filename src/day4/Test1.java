package day4;

public class Test1 {
    public static void main(String[] args) {
        int number = 1, result = 1;
        do {
            result *= number;
            number++;
        } while (number <= 10);
        System.out.print("10阶乘结果是：" + result);
    }
}
