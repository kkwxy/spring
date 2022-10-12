package com.example.demo.proxy.CGLIB_proxy.filter;

import com.example.demo.proxy.Animal;
import com.example.demo.proxy.CGLIB_proxy.CglibProxy;
import com.example.demo.proxy.Cat;
import org.springframework.cglib.core.DebuggingClassWriter;

/**
 * CGLIB 回调
 */
public class TestCGLIBFilterMain {
    public static void main(String[] args) {
        //无需实现接口，可以直接代理普通类
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "..\\springboot-demo\\CGLIB_proxy");
        CatHobby cat = (CatHobby) CglibProxyFilter.getProxy(CatHobby.class);
        cat.hobby();
    }
}
