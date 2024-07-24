package day2;

public class Test1 {
    public static void main(String[] args) {
        int a = 12;
        System.out.println(-a); // -a 是对 a 取反运算
        int b = a++;
        System.out.println(b);
        b = ++a;
        System.out.println(b);
    }
}
