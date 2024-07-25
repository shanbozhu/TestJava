package day3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("请输入一个数字：");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt(); // 接收键盘输入数据
        // 判断 用户输入的数据是否大于100
        if (num > 100) {
            System.out.println("输入的数字大于100");
        }
        // 判断 用户输入的数据是否等于100
        if (num == 100) {
            System.out.println("输入的数字等于100");
        }
        // 判断 用户输入的数据是否小于100
        if (num < 100) {
            System.out.println("输入的数字小于100");
        }
    }
}
