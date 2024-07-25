package day2;

// 最基本的运算符包括 算术运算符、赋值运算符、逻辑运算符和关系运算符等，本文将详细介绍算术运算符。

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
