package com.company;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        File file = new File("Hello.txt");
        //是否存在
        if (file.exists()) {
            //文件
//            System.out.println(file.isFile());
//            //文件路径
//            System.out.println(file.isDirectory());
            file.delete();
            System.out.println("文件删除成功");
        } else {
            System.out.println("文件不存在");
            //创建文件
            try {
                file.createNewFile();
                System.out.println("文件已经创建成功");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("文件无法创建");
            }
        }

    }
}
