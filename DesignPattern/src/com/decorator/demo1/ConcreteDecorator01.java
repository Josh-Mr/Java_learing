package com.decorator.demo1;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName ConcreteDecorator01.java
 * @Description TODO
 * @createTime 2021-02-23 16:37:00
 */
public class ConcreteDecorator01 extends AbstractDecorator {


    public ConcreteDecorator01(IAbstractComponent iAbstractComponent) {
        super(iAbstractComponent);
    }

    public void sampleOperator() {
        super.sampleOperator();

        System.out.println("我加的东西01。。。");
    }
}
