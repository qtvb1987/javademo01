package com.web.arraylistdemo;

import java.util.ArrayList;

/**
 * 方法参照 list collection
 */
public class ArrayListDemo01 {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        arrayList.add("hello1");
        arrayList.add("hello2");
        arrayList.add("hello3");
        //list有序 所以遍历的时候多了一种遍历方法 迭代器  foreach for循环
        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
    }
}
