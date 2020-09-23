package com.web.methodargs;

public class MethodArgsDemo {
    public static void main(String[] args) {
        show(1,2,3,4);
    }
    //可变参数方法声明
    //可变参数本质是数组
    //一个方法只能有一个可变参数  有多个参数，可变参数只能放最后一位
    public static  void show(double d,int... arr){
        System.out.println(arr);
        System.out.println(arr[0]);
    }
}
