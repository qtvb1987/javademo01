package com.web.hashsetdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo01 {
    public static void main(String[] args) {
        //声明集合 set 存储元素特点 ：不可重复（唯一） 无序（不能通过索引访问集合元素）
        Set set=new HashSet();
        set.add("hello1");
        set.add("hello1");
        set.add("hello1");
        //遍历 迭代器 for增强（foreach）
        //迭代器
        Iterator iterator=set.iterator();
        while (iterator.hasNext()){
            System.out.println("迭代器----"+iterator.next());
        }
        //foreach
        for(Object oo:set){
            System.out.println("foreach---"+oo);
        }
    }
}
