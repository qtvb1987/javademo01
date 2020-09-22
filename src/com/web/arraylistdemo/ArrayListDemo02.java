package com.web.arraylistdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListDemo02 {
    public static void main(String[] args) {
        //不加泛型集合声明 add类型Object
        ArrayList arrayList=new ArrayList();
        arrayList.add(11);
        arrayList.add("ddd");
        //加了泛型集合<>代表泛型
        ArrayList<String> arrayList1=new ArrayList<String>();
        arrayList1.add("add");

        Iterator<String> iterator=arrayList1.iterator();
        while (iterator.hasNext()){
            String s1=iterator.next();
            System.out.println(s1);
        }

        LinkedList<Integer> linkedList=new LinkedList<Integer>();
        linkedList.add(333);
        System.out.println(linkedList);

        for(Integer it:linkedList){
            System.out.println("for 增强----"+it);
        }
    }
}
