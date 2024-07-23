public class Main {
    public final double PI = 3.14;
    final  int a = 10;
    public String name; // 姓名
    public int age; // 年龄

    // 定义构造方法，为属性初始化
    public Main(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 获取信息的方法
    public void tell() {
        System.out.println("姓名：" + name + "，年龄：" + age);
        System.out.println("姓名：" + this.name + "，年龄：" + this.age);
    }

    public static void main(String[] args) {
        Main obj = new Main("张三", 30);
        obj.tell(); // 匿名对象
        System.out.println(
                obj.a
        );
    }
}