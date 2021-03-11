package com.input;


import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName ByteInputStreamTest.java
 * @Description TODO
 * @createTime 2021-03-10 11:31:00
 */
public class ByteInputStreamTest {

    public static void main(String[] args) {


        InputStream in = new ByteArrayInputStream("123456789".getBytes());
        try{
            byte[] b = new byte[4];
            int length;
            while ((length = in.read(b)) > 0)
            {
                String strin = new String(b,0,length);
                System.out.println(strin);
            }
        }catch (IOException e){

        }finally{
            if (in != null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }






    }
}
