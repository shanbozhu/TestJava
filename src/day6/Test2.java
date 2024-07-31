package day6;

public class Test2 {
    public static void main(String[] args) {
        // 注意：trim() 只能去掉字符串中前后的半角空格（英文空格），而无法去掉全角空格（中文空格）。可用以下代码将全角空格替换为半角空格再进行操作，其中替换是 String 类的 replace() 方法。

        String str = " hello \n"; // 去除收尾空格加换行，该空格特指 英文半角 空格。
        System.out.println(str.length()); // 输出 8
        System.out.println(str.trim().length()); // 输出 5
    }
}
