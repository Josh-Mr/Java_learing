package com.input;

import java.io.*;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName BufferOutputStreamTest.java
 * @Description TODO
 * @createTime 2021-02-28 23:10:00
 */
public class BufferOutputStreamTest {

    public static void main(String[] args) throws Exception{

        File file = new File("abc.txt");
//        FileOutputStream fileOutputStream = new FileOutputStream(file);
//
//        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
//
//        DataOutputStream dataOutputStream = new DataOutputStream(bufferedOutputStream);
//        dataOutputStream.writeUTF("关华钦");
//
//        dataOutputStream.close();
//        dataOutputStream.flush();

        InputStream in = new FileInputStream(file);
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(in));

        String s = dataInputStream.readUTF();
        dataInputStream.close();
        in.close();
        System.out.println(s);

        System.out.println();




    }
}
