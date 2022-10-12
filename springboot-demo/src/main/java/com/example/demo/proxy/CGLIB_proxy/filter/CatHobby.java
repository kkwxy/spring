package com.example.demo.proxy.CGLIB_proxy.filter;

import com.example.demo.proxy.Animal;

public class CatHobby implements Animal {

    @Override
    public void call() {
        System.out.println("喵喵喵 ~");
    }

    public void hobby(){
        System.out.println("fish ~");
    }
}