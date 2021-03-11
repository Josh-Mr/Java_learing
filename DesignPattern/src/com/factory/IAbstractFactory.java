package com.factory;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName IAbstractFactory.java
 * @Description TODO
 * @createTime 2021-02-23 14:37:00
 */
public interface IAbstractFactory {
    IPhone makePhone();
    IPC makePC();
}
