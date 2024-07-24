package day2;

public class Test {
    public static void main(String[] args) {
        float price1 = 10.9f; // 定义牙膏的价格
        double price2 = 5.8; // 定义面巾纸的价格
        int num1 = 2; // 定义牙膏的数量
        int num2 = 4; // 定义面巾纸的数量

        double res = price1 * num1 + price2 * num2; // 计算总价
        System.out.println("一共付给收银员" + res + "元"); // 输出总价

        float res1 = (float)(price1 * num1 + price2 * num2); // 计算总价
        System.out.println("一共付给收银员" + res1 + "元"); // 输出总价

        int res2 = (int)(price1 * num1 + price2 * num2); // 计算总价
        System.out.println("一共付给收银员" + res2 + "元"); // 输出总价
    }
}
