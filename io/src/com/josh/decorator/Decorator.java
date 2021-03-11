package com.josh.decorator;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName Decorator.java
 * @Description TODO
 * @createTime 2020-04-06 11:17:00
 */
public class Decorator extends ComponentImpl {

    public Component component;

    public Decorator(Component component){
        this.component = component;
    }

    public void doAction(){
        component.doAction();
    }
}
