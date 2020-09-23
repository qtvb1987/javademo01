package com.web.mapdemo;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest {
    //输入字符得到字符和字符次数  使用集合去存储
    public static void main(String[] args) {
        System.out.println("请输入您的字符串");
        String s1=new Scanner(System.in).nextLine();
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        for (int i=0;i<s1.length();i++){
            //得到字符串每个字符
            char c1=s1.charAt(i);
            //判断第一次出现字符containsKey(c1)集合中存在就返回 true
            if(!hm.containsKey(c1)){
                //第一次出现 需要给集合添加字符还有次数
                hm.put(c1,1);
            }else {
                //再次出现修改值 要在原有次数基础上加1
                int count=hm.get(c1);
                //put 添加同样键 不同值 会替换之前值内容
                hm.put(c1,++count);
            }
        }
        System.out.println(hm);
    }
}
