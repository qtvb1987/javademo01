package com.web.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo03 {
    public static void main(String[] args) {
        Collection collection=new ArrayList();
        collection.add("hello1");
        collection.add("hello2");
        collection.add("hello3");
        collection.add("hello4");

        //collection.iterator();
        //只要集合中有interator() 可以使用foreach遍历
        //使用foreach遍历(for增强)
        //for(类型 名字: 集合变量名 {输出名字}
        for (Object o1:collection){
            System.out.println(o1);
        }

        //遍历数组
        double[] arr={22.2,33,44,33.55};
        for (double d:arr){
            System.out.println(d);
        }
    }

}
