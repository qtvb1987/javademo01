package com.web.filedemo;

import java.io.File;

/**
 * 使用File类创建文件
 */
public class FileDemo01 {
    public static void main(String[] args) {
        //第一步 创建file对象
        File file=new File("d:\\aaa.txt");
        System.out.println(file);

        //第二步 了父路径
        File file1=new File("d:\\aaa","bbb.txt");
        System.out.println(file1);

        //第三种
        File file2=new File("d:\\aaa");
        File file3=new File(file2,"cc.txt");
        System.out.println(file3);

    }


}
