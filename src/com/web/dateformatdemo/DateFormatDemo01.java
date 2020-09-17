package com.web.dateformatdemo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期格式化类
 */
public class DateFormatDemo01 {
    public static void main(String[] args) throws ParseException {
        Date date=new Date();
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println(dateFormat.format(date));

        //解析 把指定的日期格式字符串 转换为Date对象
        DateFormat dateFormat1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //parse 方法 可能出现异常ParseException解析异常，pattern的格式与给定的日期字符串格式不匹配 导致产生的异常
        String d="2020-08-22 11:11:11";
        Date date1=  dateFormat1.parse(d);
        System.out.println(date1);
    }
}
