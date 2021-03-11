package com.josh.decorator.ext;

import com.josh.decorator.Component;
import com.josh.decorator.Decorator;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName ExtComponent1.java
 * @Description TODO
 * @createTime 2020-04-06 11:09:00
 */
public class ExtComponent1 extends Decorator {

    private Component component;

    public ExtComponent1(Component component) {
        super(component);
    }

    @Override
    public void doAction() {
        super.doAction();

        this.add1();

    }

    private void add1(){
        System.out.println("扩展1。。。。");
    }

}
