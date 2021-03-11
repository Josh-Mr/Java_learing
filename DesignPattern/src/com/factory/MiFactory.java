package com.factory;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName MiFactory.java
 * @Description TODO
 * @createTime 2021-02-23 14:38:00
 */
public class MiFactory implements IAbstractFactory {
    @Override
    public IPhone makePhone() {
        return new MiPhone();
    }

    @Override
    public IPC makePC() {
        return new MiPC();
    }
}
