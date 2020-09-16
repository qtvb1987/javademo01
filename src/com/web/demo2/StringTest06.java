package com.web.demo2;

public class StringTest06 extends Object{
    private  int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "StringTest06{" +
                "age=" + age +
                '}';
    }

    public static void main(String[] args) {


        StringTest06 st=new StringTest06();

        System.out.println(st);
        System.out.println(st.toString());
    }
}
