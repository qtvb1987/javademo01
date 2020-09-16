package com.web.demo;

public class test1 {
    public static void main(String[] args) {
        int a=7;
        System.out.println("输出a为"+a);
        int b=a++;
        System.out.println("输出b为"+b);
        System.out.println("输出a为"+a);
       // c=a++;
       // System.out.println("hello world");
       compare(a,b);

       char c1='a';
       int i1=c1;
       System.out.println(i1);

       short s=10;
       s=(short)(s+1);
        System.out.println(s);
    }

    public static boolean compare(int x,int y){
        System.out.println("执行了参数为Long类型的方法");
        boolean z=(x==y);
        System.out.println("执行了参数为Long类型的方法结果："+z);
        return  z;
    }
}
