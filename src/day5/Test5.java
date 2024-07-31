package day5;

public class Test5 {
    public static void main(String[] args) {
        String info = "三国演义、";
        info = info.concat("西游记、");
        info = info.concat("水浒传、");
        info = info.concat("红楼梦");
        System.out.println(info);
        String cn = "中国";
        System.out.println(cn.concat("北京").concat("海淀区").concat("人民公园"));

        String book = "三国演义"; // 字符串
        int price = 59; // 整型变量
        float readtime = 2.5f; // 浮点型变量
        System.out.println("我买了一本图书，名字是：" + book + "\n价格是：" + price + "\n我每天阅读" + readtime + "小时");
        System.out.println("我买了一本图书，名字是：" + book + "\n 价格是：" + price + "\n我每天阅读" + (price + readtime) + "小时");

        // 注意：只要“+”运算符的一个操作数是字符串，编译器就会将另一个操作数转换成字符串形式，所以应该谨慎地将其他数据类型与字符串相连，以免出现意想不到的结果。
    }
}
