
public class Test {
    public static void main(String[] args) {
        // 创建类的对象
        DataClass dc = new DataClass();

        // 对象名.变量名调用属性
        System.out.println(dc.name);
        System.out.println(dc.age);

        // 对象名.变量名调用类属性
        System.out.println(dc.website);
        System.out.println(dc.URL);

        DataClass.URL = "haha";
        dc.URL = "lala";

        // 类名.变量名调用类属性
        System.out.println(DataClass.website);
        System.out.println(DataClass.URL);
    }
}
