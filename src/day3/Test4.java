package day3;

import java.util.Calendar;

public class Test4 {
    public static void main(String[] args) {
        String weekDate = "";
        Calendar calendar = Calendar.getInstance(); // 获取当前时间
        int week = calendar.get(Calendar.DAY_OF_WEEK) - 1; // 获取星期的第几日，老外是星期日是一个星期的第一天
        switch (week) {
            case 0:
                weekDate = "星期日";
                break;
            case 1:
                weekDate = "星期一";
                break;
            case 2:
                weekDate = "星期二";
                break;
            case 3:
                weekDate = "星期三";
                break;
            case 4:
                weekDate = "星期四";
                break;
            case 5:
                weekDate = "星期五";
                break;
            case 6:
                weekDate = "星期六";
                break;
        }
        System.out.println("今天是 " + weekDate);
    }
}
