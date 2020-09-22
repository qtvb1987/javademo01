package com.web.hashsetdemo;

import java.util.HashSet;

public class HashSetDemo01 {
    public static void main(String[] args) {
        //无序 不可重复
        HashSet<String> hs=new HashSet<String>();
        hs.add("hello1");
        hs.add("hello1");
        hs.add("hello1");
        hs.add("hello2");
        hs.add("hello3");
        hs.add("hello4");
        System.out.println(hs);
        //声明集合 存储多个人
        HashSet<Person> hs2=new HashSet<Person>();
        //new 地址不一样
        Person p1=new Person("hello1",11);
        Person p2=new Person("hello2",21);
        Person p3=new Person("hello1",11);
        hs2.add(p1);
        hs2.add(p1);//地址不变 重复不添加
        hs2.add(p2);
        hs2.add(p3);
        //去重 重写Person    equals 和 hashcode
        System.out.println(hs2);

    }
}
