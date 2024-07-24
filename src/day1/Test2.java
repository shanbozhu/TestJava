package day1;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(args);
        int a = 7;
        if (5 > 3) {
            int s = 3; // 声明一个 int 类型的局部变量
            System.out.println("s = " + s);
            System.out.println("a = " + a);
        }
        System.out.println("a = " + a);
    }
}
