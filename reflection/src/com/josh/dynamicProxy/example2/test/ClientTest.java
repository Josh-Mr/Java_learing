package com.josh.dynamicProxy.example2.test;

import com.josh.dynamicProxy.example1.Subject;
import com.josh.dynamicProxy.example1.SubjectImpl;
import com.josh.dynamicProxy.example2.VectorProxy;

import java.util.Vector;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName ClientTest.java
 * @Description TODO
 * @createTime 2020-03-30 11:23:00
 */
public class ClientTest {

    public static void main(String[] args)
    {
//		List v = (List)factory(new Vector());
//
//		System.out.println(v.getClass().getName());
//
//		v.add("New");
//		v.add("York");
//
//		System.out.println(v);
//
//		v.remove(0);
//		System.out.println(v);


        SubjectImpl subject =  new SubjectImpl();

        Subject factory = (Subject) VectorProxy.factory(subject);

        String hahn = factory.show("hahn");

        System.out.println(hahn);


    }
}
