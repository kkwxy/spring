package com.example.demo.proxy.static_proxy;

import com.example.demo.proxy.Animal;

public class StaticProxyAnimal implements Animal {

    private Animal impl;

    public StaticProxyAnimal(Animal impl) {
        this.impl = impl;
    }

    @Override
    public void call() {
        System.out.println("猫饥饿");
        impl.call();
    }
}