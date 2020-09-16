package com.web.demo2;

import java.util.Scanner;

/**
 * 反转字符串
 */
public class StringTest04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入字符串");
        String s1=scanner.nextLine();
        System.out.println(reserveString(s1));
    }
    public static  String reserveString(String str){
        String re="";
        for (int i=str.length()-1;i>=0;i--){
           re+=str.charAt(i);
        }
        return re;
    }
}
