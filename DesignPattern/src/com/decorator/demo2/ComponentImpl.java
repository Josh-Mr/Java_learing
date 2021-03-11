package com.decorator.demo2;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName ComponentImpl.java
 * @Description TODO
 * @createTime 2021-03-11 09:38:00
 */
public class ComponentImpl implements IComponent {
    @Override
    public void execute() {
        System.out.println("功能A");
    }
}
