package com.web.calendarapi;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo01 {
    public static void main(String[] args) {
        Calendar calendar =Calendar.getInstance();
        int year =calendar.get(calendar.YEAR);
        System.out.println(year);

        //设置年份为1999年
        calendar.set(Calendar.YEAR,1999);
        year=calendar.get(Calendar.YEAR);
        System.out.println(year);

        //将年份减少20年
        calendar.add(Calendar.YEAR,20);
        year=calendar.get(Calendar.YEAR);
        System.out.println(year);
        //将天 改为当前calendar所表示日期的后一天
        calendar.add(Calendar.DAY_OF_MONTH,1);
        int day=calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
        //将日历对象转换为日期对象
        Date d=calendar.getTime();
        System.out.println(d);
    }
}
