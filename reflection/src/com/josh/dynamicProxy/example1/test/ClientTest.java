package com.josh.dynamicProxy.example1.test;

import com.josh.dynamicProxy.example1.ProxyClass;
import com.josh.dynamicProxy.example1.Subject;
import com.josh.dynamicProxy.example1.SubjectImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName ClientTest.java
 * @Description TODO
 * @createTime 2020-03-29 21:52:00
 */
public class ClientTest {
    public static void main(String[] args) {

        // 真实对象（被代理对象）
        Subject subject = new SubjectImpl();
        Class<? extends SubjectImpl> subjectClass = (Class<? extends SubjectImpl>) subject.getClass();

        // 代理对象
        InvocationHandler proxyClass = new ProxyClass(subject);
        Class<? extends ProxyClass> proxyClassClass = (Class<? extends ProxyClass>) proxyClass.getClass();

        //// 传入ClassLoader、传入要实现的接口、传入处理调用方法的InvocationHandler
        Subject newProxyInstance = (Subject) Proxy.newProxyInstance(proxyClassClass.getClassLoader(), subjectClass.getInterfaces(), proxyClass);

        String show = newProxyInstance.show("josh");
//        newProxyInstance.test();

        System.out.println(show);

        // 下面两种方式都是：传入要实现的接口
        System.out.println(subject.getClass().getInterfaces() );
        System.out.println(new Object[]{Subject.class});


    }
}
