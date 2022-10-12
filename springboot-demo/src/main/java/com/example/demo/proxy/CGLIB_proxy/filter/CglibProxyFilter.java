package com.example.demo.proxy.CGLIB_proxy.filter;

import com.example.demo.proxy.CGLIB_proxy.TargetInterceptor;
import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;

public class CglibProxyFilter {

    public static Object getProxy(Class<?> clazz){
        Enhancer enhancer = new Enhancer();
        enhancer.setClassLoader(clazz.getClassLoader());
        enhancer.setSuperclass(clazz);
        enhancer.setCallbacks(new Callback[]{new TargetInterceptor(), new TargetInterceptor2()});
        enhancer.setCallbackFilter(new TargetCallbackFilter());
        return enhancer.create();
    }
}