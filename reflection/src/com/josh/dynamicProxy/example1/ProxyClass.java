package com.josh.dynamicProxy.example1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName ProxyClass.java
 * @Description TODO
 * @createTime 2020-03-29 21:47:00
 */
public class ProxyClass implements InvocationHandler {

    public Object object;

    public ProxyClass(Object object){
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("method the invoke is "+proxy.getClass());

        System.out.println("start.....");

        Object invoke = method.invoke(object, args);

        System.out.println("end......");

        return invoke;
    }
}
