package com.web.calendarapi;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarDemo02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入年份");
        int year=scanner.nextInt();
        Calendar calendar=Calendar.getInstance();
        calendar.set(year,2,1);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_MONTH,-1);
        System.out.println(calendar.getTime());
        int days=calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
    }

}
