package day3;

public class Test1 {
    public static void main(String[] args) {
        String username = "admin"; // 用户名
        String userpass = "123456"; // 密码
        String code = "0000"; // 验证码
        if (username != "admin" && userpass != "123456" && code != "0000") {
            System.out.println("登录失败！");
            System.out.println("请检查输入的用户名、密码和验证码是否正确！");
        }

        String today = "周末";
        String weather = "晴朗";
        if (today.equals("周末")) {
            if (weather.equals("晴朗")) {
                System.out.println("去室外游乐场游玩");
            } else {
                System.out.println("去室内游乐场游玩");
            }
        } else {
            System.out.println("去上班");
        }
    }
}
