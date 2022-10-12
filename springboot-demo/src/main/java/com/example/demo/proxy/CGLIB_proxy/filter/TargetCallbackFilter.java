package com.example.demo.proxy.CGLIB_proxy.filter;

import org.springframework.cglib.proxy.CallbackFilter;

import java.lang.reflect.Method;

public class TargetCallbackFilter implements CallbackFilter {
    @Override
    public int accept(Method method) {
        if ("hobby".equals(method.getName()))
            return 1;
        else
            return 0;
    }
}