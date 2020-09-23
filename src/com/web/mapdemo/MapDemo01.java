package com.web.mapdemo;

import java.util.*;

public class MapDemo01 {
    public static void main(String[] args) {
        //map中没有迭代器所以不能直接遍历  需要转换成其他集合帮助遍历
        Map m1=new HashMap();
        //存储健值对关系数据
        m1.put("1","a");
        m1.put("2","b");
        m1.put("3","c");
        //判断键,值
        System.out.println(m1.containsKey("1"));
        System.out.println(m1.containsValue("a"));
        //通过键取值
        System.out.println(m1.get("1"));
        //移除键值对
        //m1.remove("1");
        //清空
        //m1.clear();
        //返回map集合元素个数 键值对的个数
        System.out.println(m1.size());
        //把所有值转换成collection集合
        Collection c1=m1.values();
        System.out.println(c1);
        //把集合中键转换成以set接受 通过下面这个方法遍历map集合
        Set s1=m1.keySet();
        for(Object o1:s1){
            System.out.println("键--"+o1+" 值--"+m1.get(o1));
        }
        //迭代器
        Iterator ii2=s1.iterator();
        while (ii2.hasNext()){
            Object o8=ii2.next();
            System.out.println("键=="+o8+"值=="+m1.get(o8));
        }
        System.out.println(s1);
        //map第二种遍历
        Set<Map.Entry<Object,Object>> me=m1.entrySet();
        Iterator<Map.Entry<Object,Object>> i1=me.iterator();
        while (i1.hasNext()){
            Map.Entry<Object,Object> entry =i1.next();
            System.out.println("键=="+entry.getKey()+"值=="+entry.getValue());
        }
        for(Map.Entry<Object,Object> o1:me){
            System.out.println("键=="+o1.getKey()+"值=="+o1.getValue());

        }

        System.out.println(m1);
    }
}
