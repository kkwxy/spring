package com.example.demo.proxy.CGLIB_proxy;

import org.springframework.cglib.proxy.Enhancer;

public class CglibProxy {

    public static Object getProxy(Class<?> clazz){
        Enhancer enhancer = new Enhancer();
        // 设置类加载
        enhancer.setClassLoader(clazz.getClassLoader());
        // 设置被代理类
        enhancer.setSuperclass(clazz);
        // 设置方法拦截器
        enhancer.setCallback(new TargetInterceptor());
        // 创建代理类
        return enhancer.create();
    }

}