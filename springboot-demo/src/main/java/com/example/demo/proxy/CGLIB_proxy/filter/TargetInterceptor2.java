package com.example.demo.proxy.CGLIB_proxy.filter;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class TargetInterceptor2 implements MethodInterceptor {

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("CGLIB 调用前 TargetInterceptor2");
        Object result = proxy.invokeSuper(obj, args);
        System.out.println("CGLIB 调用后 TargetInterceptor2");
        return result;
    }
}
