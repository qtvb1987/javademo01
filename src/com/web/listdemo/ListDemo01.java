package com.web.listdemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo01 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("hello1");
        list.add("hello2");
        list.add("hello3");
        list.add("hello4");
        System.out.println(list);
        //插入1 下标元素
        list.add(1,"hello8");
        System.out.println(list);
        //得到1 下标元素
        System.out.println(list.get(1));
        //替换0下标元素
        list.set(0,"hello world");
        System.out.println(list);
        //移除 1 下标元素
        list.remove(1);
        System.out.println(list);
    }
}
