package com.josh;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName Demo.java
 * @Description TODO
 * @createTime 2020-04-01 22:53:00
 */
public class Demo {
    public static void main(String[] args) throws IOException {

        File file  = new File("d:/abc.txt");
        /**
         * CRUD
         * add : createNewFile()
         * delete : delete();
         *
         */
        file.createNewFile();

        System.out.println(file.canExecute());

        System.out.println(file.canRead());

        System.out.println(file.canWrite());


        System.out.println(file.getAbsolutePath());

        System.out.println(file.getAbsolutePath().equals("d:"+File.separator+"abc.txt"));

        // 获取相对路径
        System.out.println(file.getPath());
        // 获取绝对路径
        System.out.println(file.getAbsolutePath());

        System.out.println(file.getParentFile());

//        file.delete();
//        file.createNewFile();
        System.out.println(file.getParentFile().isDirectory());

        System.out.println("---------------");
        System.out.println(file.getName());
//        System.out.println(new File("d:/reNameAbc.txt").renameTo(file));

        System.out.println(file.getName());

        System.out.println(file.length());
//        File path = new File("d:/josh/josh1/");
//        path.mkdirs();
//        File mkdir =  new File("d:/josh/josh1/josh.txt");
//        System.out.println(mkdir.createNewFile());

        File file1= new File("d:/");

        String[] list = file1.list();
        System.out.println(list.toString());
        for (String s : list){
            System.out.println(s);
        }

        // 区别
//        System.out.println(mkdir.mkdir());
//
//        System.out.println(mkdir.mkdirs());








    }

}
