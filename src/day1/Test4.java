package day1;

public class Test4 {
    public static void test() {
        try {
            System.out.println("Hello! Exception!");
        } catch (Exception e) { // 异常处理块，参数为 Exception 类型
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        test();
    }
}
