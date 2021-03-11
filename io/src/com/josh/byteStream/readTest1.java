package com.josh.byteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName readTest1.java
 * @Description TODO
 * @createTime 2020-04-04 22:03:00
 */
public class readTest1 {

    public static void main(String[] args) throws IOException {


        InputStream inputStream= new FileInputStream("abc.txt");


        byte[] bytes = new byte[4];

        while (inputStream.read(bytes,0,bytes.length) != -1){

            String info  = new String(bytes,"UTF-8");

            System.out.println(info);
            System.out.println("-----");
        }


        inputStream.close();



    }

}
