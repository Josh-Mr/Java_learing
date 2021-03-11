package com.decorator.demo2;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName ConcreteDemo01.java
 * @Description TODO
 * @createTime 2021-03-11 09:50:00
 */
public class ConcreteDemo01 extends Decorator {

    public ConcreteDemo01(IComponent iComponent) {
        super(iComponent);
    }

    @Override
    public void execute() {
        super.execute();
        System.out.println("功能B");
    }
}
