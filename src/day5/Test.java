package day5;

public class Test {
    public static void main(String[] args) {
        String str = "我是一只小小鸟"; // 结果：我是一只小小鸟
        String word;
        word = "I am a bird"; // 结果：I am a bird
        word = "<h1>to fly</h1>"; // 结果：<h1>to fly</h1>
        System.out.println(word);
        word = "Let\'s say that it\'s true"; // 结果：Let's say that it's true
        System.out.println(word);
        word = "北京\\上海\\广州"; // 结果：北京\上海\广州
        System.out.println(word);
    }
}
