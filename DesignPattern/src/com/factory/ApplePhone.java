package com.factory;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName ApplePhone.java
 * @Description TODO
 * @createTime 2021-02-23 14:40:00
 */
public class ApplePhone implements IPhone {
    public ApplePhone(){
    }
    @Override
    public void make() {
        System.out.println("apple phone");
    }
}
