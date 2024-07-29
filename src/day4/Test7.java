package day4;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // 定义变量存储小明的回答
        String answer = ""; // 一圈100米，1000米为10圈，即为循环的次数
        for (int i = 0; i < 10; i++) {
            System.out.println("跑的是第" + (i + 1) + "圈");
            System.out.println("还能坚持吗？"); // 获取小明的回答
            answer = input.next(); // 判断小明的回答是否为y？如果不是，则放弃，跳出循环
            if (!answer.equals("y")) {
                System.out.println("放弃");
                break; // break 语句能用于任何 Java 循环中，包括人们有意设置的无限循环。在一系列嵌套循环中使用 break 语句时，它将仅仅终止 最里面 的循环。
            }
            // 循环之后的代码
            System.out.println("加油！继续！");
        }
    }
}
