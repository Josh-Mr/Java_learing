package com.singleton;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName SingletonDemo3.java
 * @Description TODO
 * @createTime 2021-02-22 22:22:00
 */
/**
 * 饿汉式
 * */
public class SingletonDemo3 {
    private static SingletonDemo3 singletondemo3 = new SingletonDemo3();
    private SingletonDemo3(){

    }

    public static SingletonDemo3 getInstance(){
        return singletondemo3;
    }
}
