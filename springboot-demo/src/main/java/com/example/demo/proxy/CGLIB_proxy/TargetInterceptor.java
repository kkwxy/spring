package com.example.demo.proxy.CGLIB_proxy;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class TargetInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("CGLIB 调用前");
        Object result = proxy.invokeSuper(obj, args);
        System.out.println("CGLIB 调用后");
        return result;
    }
}