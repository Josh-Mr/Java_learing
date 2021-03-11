package com.singleton;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName SingletonDemo.java
 * @Description TODO
 * @createTime 2021-02-22 17:43:00
 */
/**
* 懒汉式:线程安全的，但是有可能存在线程阻塞。*/
public class SingletonDemo {
    private static SingletonDemo singletonDemo = null;
    private SingletonDemo(){
    }
    public static synchronized SingletonDemo getInstance(){
        if(singletonDemo == null){
            singletonDemo = new SingletonDemo();
        }
        return singletonDemo;
    }
}

