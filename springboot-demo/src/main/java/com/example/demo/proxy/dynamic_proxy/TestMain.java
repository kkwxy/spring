package com.example.demo.proxy.dynamic_proxy;

import com.example.demo.proxy.Animal;
import com.example.demo.proxy.Cat;

import java.lang.reflect.Proxy;

public class TestMain {
    public static void main(String[] args) {
        try {
            Animal proxy = (Animal) DynamicProxyAnimal.getProxy(new Cat());
            proxy.call();
            //直接写代码
            //DynamicProxyAnimal代码摘出来
            System.out.println("=================================");
            Object target = new Cat();
            Animal proxy2 = (Animal) Proxy.newProxyInstance(
                    target.getClass().getClassLoader(), // 指定目标类的类加载
                    target.getClass().getInterfaces(),  // 代理需要实现的接口，可指定多个，这是一个数组
                    new TargetInvoker(target)   // 代理对象处理器
            );
            proxy2.call();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
