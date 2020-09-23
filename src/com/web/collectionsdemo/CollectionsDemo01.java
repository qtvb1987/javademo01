package com.web.collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo01 {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(11);
        al.add(22);
        al.add(33);
        //通过Collections往al 集合中添加元素
        Collections.addAll(al,44,55,66);
        System.out.println(al);
    }
}
