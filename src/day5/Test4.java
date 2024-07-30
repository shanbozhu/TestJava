package day5;

public class Test4 {
    public static void main(String[] args) {
        // 与绝大多数的程序设计语言一样，Java 语言允许使用“+”号连接（拼接）两个字符串。“+”运算符是最简单、最快捷，也是使用最多的字符串连接方式。在使用“+”运算符连接字符串和 int 型（或 double 型）数据时，“+”将 int（或 double）型数据自动转换成 String 类型。

        int[] no = new int[] { 501, 101, 204, 102, 334 }; // 定义学号数组
        String[] names = new String[] { "张城", "刘丽丽", "李国旺", "孟红霞", "贺宁" }; // 定义姓名数组
        String[] classes = new String[] { "数学", "语文", "数学", "英语", "英语" }; // 定义课程数组
        System.out.println("本次考试学生信息如下：");
        // 循环遍历数组，连接字符串
        for (int i = 0; i < no.length; i++) {
            System.out.println("学号：" + no[i] + "|姓名：" + names[i] + "|课程：" + classes[i] + "|班级：" + "初二（三）班");
        }
    }
}
