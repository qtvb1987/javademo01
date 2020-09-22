package com.web.fanxingdemo;

/**
 * 泛型类
 * @param <T>
 */
public class FanXingDemo01<T> {
    T t1;
    public  void  show(){
        System.out.println(t1);
    }
    public static void main(String[] args) {
        FanXingDemo01<String> fanXingDemo01=new FanXingDemo01<String>();
       // fanXingDemo01.show();
        fanXingDemo01.play(new String());
    }

    public <MM> void  play(MM m){
        System.out.println(m);
    }
}
