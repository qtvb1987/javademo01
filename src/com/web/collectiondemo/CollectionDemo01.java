package com.web.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo01 {
    public static void main(String[] args) {
        Collection collections=new ArrayList();
        collections.add("张三");
        collections.add("张三");
        collections.add(33);
        collections.add("李四");
        //移除
        collections.remove(33);
        //判断
        System.out.println(collections.contains(33));

        //清空
        //collections.clear();

        System.out.println(collections);
        Object[] arr=collections.toArray();
        for (int i=0;i<arr.length;i++)
        {
            System.out.println("arr ==="+arr[i]);
        }

        //集合遍历 ==》迭代器
        Iterator it=collections.iterator();
        while (it.hasNext()){
            System.out.println("集合遍历==>"+it.next());//next() 指针移到下一位
        }

    }
}
