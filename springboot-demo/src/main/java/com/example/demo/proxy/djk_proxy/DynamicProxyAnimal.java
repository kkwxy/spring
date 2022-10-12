package com.example.demo.proxy.djk_proxy;

import java.lang.reflect.Proxy;

public class DynamicProxyAnimal {

    public static Object getProxy(Object target) throws Exception {
        //System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Object proxy = Proxy.newProxyInstance(
                target.getClass().getClassLoader(), // 指定目标类的类加载
                target.getClass().getInterfaces(),  // 代理需要实现的接口，可指定多个，这是一个数组
                new TargetInvoker(target)   // 代理对象处理器
        );
        return proxy;
    }

}