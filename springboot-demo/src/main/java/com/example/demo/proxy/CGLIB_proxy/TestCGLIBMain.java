package com.example.demo.proxy.CGLIB_proxy;

import com.example.demo.proxy.Animal;
import com.example.demo.proxy.Cat;

public class TestCGLIBMain {
    public static void main(String[] args) {
        Animal cat = (Animal) CglibProxy.getProxy(Cat.class);
        cat.call();
    }
}
