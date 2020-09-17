package com.web.datedemo;

import java.util.Date;

/**
 * Date类
 */
public class DateDemo01 {
    public static void main(String[] args) {
        //当前时间
        Date date=new Date();
        System.out.println(date);
        //标准的基准时间
        Date date1=new Date(0);
        System.out.println(date1);

        //public long getTime() 把日期转换成对应时间的毫秒值
        long currentTime=date.getTime();
        System.out.println(currentTime);
        //public void setTime(long time) 把毫秒值转换成日期
        date1.setTime(currentTime);
        System.out.println(date1);
    }
}
