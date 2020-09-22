package com.web.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 并发问题
 */
public class CollectionDemo02 {
    public static void main(String[] args) {
        Collection collection=new ArrayList();
        collection.add("hello1");
        collection.add("hello2");
        collection.add("hello3");
        collection.add("hello4");

        //java.util.ConcurrentModificationException
        //在迭代器遍历过程中，不能修改集合长度
        //迭代器
        Iterator iterator=collection.iterator();
        while (iterator.hasNext()){
            Object o1=iterator.next();
            String s1=(String) o1;//向下转型
            if(s1.equals("hello2")){
                collection.add("hello5");
            }
        }
    }
}
