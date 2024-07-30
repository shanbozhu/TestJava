package day5;

public class Test1 {
    // 注意：具有和类名相同的名称，而且没有返回类型的方法称为构造方法。重载是指在一个类中定义多个同名的方法，但要求每个方法具有不同的参数的类型或参数的个数。教程后面会详细讲解，这里了解一下就可以。
    public static void main(String[] args) {
        String str1 = new String("Hello Java");
        String str2 = new String(str1);
        System.out.println(str2 == str1);
        System.out.println(str2.equals(str1));
    }
}
