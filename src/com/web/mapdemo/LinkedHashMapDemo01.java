package com.web.mapdemo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo01 {
    public static void main(String[] args) {
        //遍历顺序特点 保证成对元素唯一  底层是哈希表双向链表，保证迭代顺序
        LinkedHashMap<String,String> lhm=new LinkedHashMap<String,String>();
        lhm.put("1","a");
        lhm.put("2","b");
        lhm.put("3","c");

        Set<Map.Entry<String,String>> ss=lhm.entrySet();
        for (Map.Entry<String,String> mm:ss){
            System.out.println(mm.getKey()+"--"+mm.getValue());
        }

    }
}
