package com.josh.dynamicProxy.example2;

import com.josh.dynamicProxy.example1.Subject;
import com.josh.dynamicProxy.example1.SubjectImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * 实现仿照动态代理的工具类
 */
public class VectorProxy implements InvocationHandler
{
	private Object proxyObj;

	public VectorProxy(Object obj)
	{
		this.proxyObj = obj;
	}

	public static Object factory(Object obj)
	{
		Class<?> classType = obj.getClass();

		/*
		* 加载器
		* 真实类的接口
		* 代理实例
		* */
		return Proxy.newProxyInstance(classType.getClassLoader(),
				classType.getInterfaces(), new VectorProxy(obj));
	}
	
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable
	{
		System.out.println("before calling: " + method);
		
		if(null != args)
		{
			for(Object obj : args)
			{
				System.out.println(obj);
			}
		}
		
		Object object = method.invoke(proxyObj, args);
		
		System.out.println("after calling: " + method);
		
		return object;
	}
	

}
