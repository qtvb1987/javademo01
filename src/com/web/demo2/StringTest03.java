package com.web.demo2;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class StringTest03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入字符串");
        String str=scanner.nextLine();
        //定义变量 记录次数
        int BigAZ=0;
        int smallaz=0;
        int number=0;
        for (int i=0;i<str.length();i++){
            //得到字符串每一个字符
            char ch=str.charAt(i);
            if(ch>='A'&&ch<='Z')
            {
                BigAZ++;
            }else if(ch>='a'&&ch<='z'){
                smallaz++;
            }else if(ch>='0'&&ch<='9'){
                number++;
            }
        }
        System.out.println("大写字母次数"+BigAZ);
        System.out.println("小写字母次数"+smallaz);
        System.out.println("数字次数"+number);
    }
}
