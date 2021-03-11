package com.factory;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName MiPhone.java
 * @Description TODO
 * @createTime 2021-02-23 14:42:00
 */
public class MiPhone implements IPhone{

    public MiPhone(){
    }
    @Override
    public void make() {
        System.out.println("mi phone");
    }
}
