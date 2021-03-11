package com.input;

import java.io.*;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName InputStreamDemo.java
 * @Description TODO
 * @createTime 2021-02-24 17:09:00
 */
public class InputStreamDemo{
    public static void main(String[] args) throws IOException {


        File file = new File("d:/abc/test.txt");
        FileInputStream fileInputStream = new FileInputStream(file);

        byte bytes;
        while ((bytes = (byte) fileInputStream.read()) != -1){
            System.out.println((char) bytes);
        }








    }
}
