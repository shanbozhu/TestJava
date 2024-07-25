package day2;

public class Test4 {
    public static void main(String[] args) {
        int x = 5, y = 12; // 创建整型变量保存两个数
        int z = x & y; // 对这两个数进行位与运算，结果保存到z
        System.out.println(z);

        System.out.println(8 >> 1); // 按位右移
        System.out.println(8 << 1); // 按位左移

        int a = 1;
        int b = 2;
        int c = 3;
        a &= 4;
        a |= 4;
        a ^= c;
        a -= 6;
        b >>= 1;
        c <<= 1;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}


