package com.josh.dynamicProxy.example1;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName SubjectImpl.java
 * @Description TODO
 * @createTime 2020-03-29 21:46:00
 */
public class SubjectImpl implements Subject {

    @Override
    public String show(String  name) {
        System.out.println("真实执行咯~~~");
        return "ok";
    }

    @Override
    public void test() {
        System.out.println("test");
    }
}
