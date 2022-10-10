package com.example.demo.proxy.static_proxy;

import com.example.demo.proxy.Animal;
import com.example.demo.proxy.Cat;

/**
 * 静态代理
 */
public class TestMain {

    public static void main(String[] args) {

        Animal staticProxy1 = new Cat();
        staticProxy1.call();
        System.out.println("=======================");
        //交给StaticProxyAnimal代理。
        //Cat叫之前是因为肚子饿了，所以我们需要在目标对象方法Cat
        //call之前说明是饥饿，这是使用静态代理实现猫饥饿然后发出叫声。
        Animal staticProxy = new StaticProxyAnimal(new Cat());
        staticProxy.call();
    }
}
