package com.josh.decorator.test;

import com.josh.decorator.Component;
import com.josh.decorator.ComponentImpl;
import com.josh.decorator.Decorator;
import com.josh.decorator.ext.ExtComponent1;
import com.josh.decorator.ext.ExtComponent2;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName Client.java
 * @Description TODO
 * @createTime 2020-04-06 11:25:00
 */
public class Client {


    public static void main(String[] args) {
        // 节点流
        Component component = new ComponentImpl();
        // 过滤流
        Component component1 = new ExtComponent1(component);
        // 过滤流
        Component component3 = new ExtComponent2(component1);
        component3.doAction();

    }



}
