package com.web.linkedlistdemo;

import java.util.LinkedList;

public class LinkedListDemo01 {
    public static void main(String[] args) {
        LinkedList link=new LinkedList();
        link.add("hello1");
        link.add("hello2");
        link.add("hello3");
        link.addFirst("hello0");
        link.addLast("hello100");
        System.out.println(link);
        //得到第一个
        System.out.println(link.getFirst());
        //得到最后一个
        System.out.println(link.getLast());
        //删除第一个
        link.removeFirst();
        System.out.println(link);
        link.removeLast();
        System.out.println(link);
        //其他方法参照List，collection
    }
}
