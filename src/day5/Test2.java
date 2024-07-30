package day5;

public class Test2 {
    public static void main(String[] args) {
        String str = "123";
        int n = 0;
        // 第一种转换方法：Integer.parseInt(str)
        n = Integer.parseInt(str);
        System.out.println("Integer.parseInt(str) : " + n);

        // 第二种转换方法：Integer.valueOf(str).intValue()
        n = 0;
        n = Integer.valueOf(str).intValue();
        System.out.println("Integer.valueOf(str).intValue() : " + n);
    }
}
