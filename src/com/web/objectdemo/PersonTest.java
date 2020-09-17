package com.web.objectdemo;

public class PersonTest {
    public static void main(String[] args) {
       Person p=new Person(22,"qing");
       Person p2=new Person(22,"qing");
        System.out.println(p);
        System.out.println(p2.toString());
        boolean bo=p.equals(p2);
        System.out.println("boolean  "+bo);
    }
}
