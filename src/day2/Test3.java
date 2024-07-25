package day2;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        int number1, number2; // 定义变量，保存输入的两个数
        System.out.print("请输入第一个整数(number1)：");
        Scanner input = new Scanner(System.in);
        number1 = input.nextInt(); // 输入第一个数
        System.out.print("请输入第二个整数(number2)：");
        input = new Scanner(System.in);
        number2 = input.nextInt(); // 输入第二个数
        System.out.printf("number1 = %d, number2 = %d\n", number1, number2); // 输出这两个数
        // 判断用户输入的两个数是否相等
        if (number1 == number2) {
            System.out.println("number1 和 number2 相等。");
        }
        // 判断用户输入的两个数据是否相等
        if (number1 != number2) {
            System.out.println("number1 和 number2 不相等。");
            // 判断用户输入的数1是否大于数2
            if (number1 > number2) {
                System.out.println("number1 大于 number2。");
            }
            // 判断用户输入的数1是否小于数2
            if (number1 < number2) {
                System.out.println("number1 小于 number2。");
            }
        }
    }
}
