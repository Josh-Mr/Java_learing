package com.factory;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName AppleFactory.java
 * @Description TODO
 * @createTime 2021-02-23 14:44:00
 */
public class AppleFactory implements IAbstractFactory {
    @Override
    public IPhone makePhone() {
        return new ApplePhone();
    }

    @Override
    public IPC makePC() {
        return new ApplePC();
    }
}
