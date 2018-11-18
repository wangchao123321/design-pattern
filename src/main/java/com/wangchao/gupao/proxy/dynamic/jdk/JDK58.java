package com.wangchao.gupao.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDK58 implements InvocationHandler {

    private Person target;

    public Object getInctance(Person target){
        this.target = target;

        Class<?> clazz = target.getClass();

        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("58找工作");
        method.invoke(this.target,args);
        System.out.println("58成功");
        return null;
    }
}
