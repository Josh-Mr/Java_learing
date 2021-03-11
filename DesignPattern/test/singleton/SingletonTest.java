package singleton;

import com.singleton.SingletonDemo;
import com.singleton.SingletonDemo2;

import java.io.*;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName SingletonTest.java
 * @Description TODO
 * @createTime 2021-02-22 17:54:00
 */
public class SingletonTest {

    public static void main(String[] args) throws IOException {

        SingletonDemo singletonDemo= SingletonDemo.getInstance();

        SingletonDemo2 singletonDemo2 = SingletonDemo2.INSTANCE;

        System.out.println(singletonDemo.hashCode());



    }
}
