package com.josh.decorator;

import com.josh.decorator.Component;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName ComponentImpl.java
 * @Description TODO
 * @createTime 2020-04-06 11:07:00
 */
public class ComponentImpl implements Component {

    @Override
    public void doAction() {
        System.out.println("基础功能。。。。。");
    }
}
