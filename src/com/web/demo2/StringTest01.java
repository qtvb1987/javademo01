package com.web.demo2;

import java.util.Scanner;

/**
 * 模拟用户登录 三次机会 登录成功会有提示
 */
public class StringTest01 {
    public static void main(String[] args) {
        String username="admin";
        String password="123456";
        Scanner scanner= new Scanner(System.in);
        for (int i=2;i>=0;i--){
            System.out.println("请输入用户名:");
            String name=scanner.next();
            System.out.println("请输入密码：");
            String pwd=scanner.next();
            if(name.equals(username)&&pwd.equals(password)){
                System.out.println("登录成功");
                break;
            }
            else {
               if(i==0){
                   System.out.println("账号被锁定");
               }else {
                   System.out.println("登录失败，你还有"+i+"次机会");
               }
            }
        }

    }

}
