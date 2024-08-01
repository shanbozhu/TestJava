package day6;

public class Test3 {
    public static void main(String[] args) {
        String str = "我爱 Java 编程";
        String result = str.substring(3);
        System.out.println(result); // 输出：Java 编程

        String day = "Today is Monday"; // 原始字符串
        System.out.println("substring(0)结果：" + day.substring(0));
        System.out.println("substring(2)结果："+ day.substring(2));
        System.out.println("substring(10)结果：" + day.substring(10));
        System.out.println("substring(2, 10)结果：" + day.substring(2, 10)); // 左闭右开区间 [2, 10)
        System.out.println("substring(0, 5)结果：" + day.substring(0, 5));

        str = null;
        System.out.println(str); // 输出：null
    }
}
