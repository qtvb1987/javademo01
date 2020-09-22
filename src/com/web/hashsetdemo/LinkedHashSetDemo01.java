package com.web.hashsetdemo;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo01 {
    public static void main(String[] args) {
        LinkedHashSet lhs=new LinkedHashSet();
        lhs.add("java");
        lhs.add("python");
        lhs.add("c#");
        System.out.println(lhs);
        for(Object o1:lhs){
            System.out.println(o1);
        }

        Set<String> set =new LinkedHashSet<String>();
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        set.add("ddd");
        Iterator<String> it=set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        for (String s:set){
            System.out.println(s);
        }
    }
}
