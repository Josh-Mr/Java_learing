package com.decorator.demo1;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName ConcreteComponent.java
 * @Description TODO
 * @createTime 2021-02-23 16:25:00
 */
public class ConcreteComponent implements IAbstractComponent {
    @Override
    public void sampleOperator() {
        System.out.println("原来具体操作。。。");
    }
}
