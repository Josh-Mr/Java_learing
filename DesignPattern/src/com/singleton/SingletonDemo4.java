package com.singleton;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName SingletonDemo4.java
 * @Description TODO
 * @createTime 2021-02-22 22:54:00
 */
/**
 * 内部类的方式*/
public class SingletonDemo4 {
    private SingletonDemo4(){}

    public static SingletonDemo4 getInstance(){
        return SingletonDemo4Handle.SINGLETON_DEMO_4;
    }

    private static class SingletonDemo4Handle{
        private static final SingletonDemo4 SINGLETON_DEMO_4 = new SingletonDemo4();
    }
}
