package com.josh;

import java.io.*;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName Demo2.java
 * @Description TODO
 * @createTime 2020-04-06 11:47:00
 */
public class Demo2 {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("d:/abc.txt");
        FileInputStream fileInputStream = new FileInputStream(file);

        BufferedInputStream bufferedInputStream =  new BufferedInputStream(fileInputStream);
        DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);



    }
}
