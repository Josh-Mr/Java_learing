package com.factory;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName MiPC.java
 * @Description TODO
 * @createTime 2021-02-23 14:32:00
 */
public class MiPC implements IPC{
    public MiPC(){
    }
    @Override
    public void make() {
        System.out.println("mi PC");
    }
}
