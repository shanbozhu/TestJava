package day4;

public class Test4 {
    public static void main(String[] args) {
        // 声明并初始化数组
        int[] numbers = { 43, 32, 53, 54, 75, 7, 10 };
        System.out.println("----for----");
        // for语句
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Count is:" + numbers[i]);
        }

        System.out.println("----for each----"); // 类似oc的for in
        // for-each语句
        for (int item : numbers) {
            System.out.println("Count is:" + item);
        }

        String[] urls = { "http://c.biancheng.net/java", "http://c.biancheng.net/c", "http://c.biancheng.net/golang/" };
        // 使用for each循环来遍历数组元素
        for (String url : urls) {
            System.out.println(url);
        }
    }
}
