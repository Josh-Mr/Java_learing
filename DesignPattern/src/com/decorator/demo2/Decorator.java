package com.decorator.demo2;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName Decorator.java
 * @Description TODO
 * @createTime 2021-03-11 09:40:00
 */
public class Decorator implements IComponent {

    private IComponent iComponent;

    public Decorator (IComponent iComponent){
        this.iComponent = iComponent;
    }


    @Override
    public void execute() {
        iComponent.execute();
    }


}
