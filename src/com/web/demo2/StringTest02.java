package com.web.demo2;

import java.util.Scanner;

/**
 * 遍历字符串
 */
public class StringTest02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入字符串");
        String s1=scanner.nextLine();
        for (int i=0;i<s1.length();i++){
            System.out.println(s1.charAt(i));
        }
    }
}
