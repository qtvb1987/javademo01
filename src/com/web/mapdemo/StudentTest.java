package com.web.mapdemo;

import java.util.HashMap;
import java.util.Set;

public class StudentTest {
    public static void main(String[] args) {
        HashMap<Student,String> hm=new HashMap<Student,String>();
        Student s1=new Student("xiao1",22);
        Student s2=new Student("xiao2",22);
        Student s3=new Student("xiao3",22);
        hm.put(s1,"wuhan");
        hm.put(s2,"beijing");
        hm.put(s3,"shanghai");
        System.out.println(hm);

        //遍历
        Set<Student> students=hm.keySet();
        for (Student s:students){
            //得到对象Student 属性值
            //s.getName();
            //s.getAge();

            System.out.println(s);
        }
    }
}
