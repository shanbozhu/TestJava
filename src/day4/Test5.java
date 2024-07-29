package day4;

public class Test5 {
    public static void main(String[] args) {
        String[] urls = {
                "http://c.biancheng.net/java",
                "http://c.biancheng.net/c",
                "http://c.biancheng.net/golang/"
        };
        // 使用foreach循环来遍历数组元素
        for (String url : urls) {
            url = "https://c.biancheng.net"; // 改变的只是url这个局部变量，并没有真正改变urls数组
            System.out.println(url);
        }
        System.out.println(urls[0]);
    }
}
