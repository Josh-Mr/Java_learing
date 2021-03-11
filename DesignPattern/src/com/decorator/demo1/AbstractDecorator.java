package com.decorator.demo1;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName AbstractDecorator.java
 * @Description TODO
 * @createTime 2021-02-23 16:27:00
 */
public class AbstractDecorator implements IAbstractComponent{

    public IAbstractComponent iAbstractComponent;

    public AbstractDecorator(IAbstractComponent iAbstractComponent){
        this.iAbstractComponent = iAbstractComponent;
    }

    @Override
    public void sampleOperator() {
        iAbstractComponent.sampleOperator();
    }
}
