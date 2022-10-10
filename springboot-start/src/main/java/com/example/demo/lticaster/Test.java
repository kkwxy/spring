package com.example.demo.lticaster;

import com.example.demo.lticaster.event.RainEvent;
import com.example.demo.lticaster.event.SnowEvent;
import com.example.demo.lticaster.listener.RainListener;
import com.example.demo.lticaster.listener.SnowListener;
import com.example.demo.lticaster.multicaster.WeatherEventMulticaster;
import org.jasypt.encryption.pbe.StandardPBEByteEncryptor;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class Test {

    public static void main(String[] args) {
//        //广播
//        WeatherEventMulticaster eventMulticaster = new WeatherEventMulticaster();
//        //添加监听
//        RainListener rainListener = new RainListener();
//        String even = "111";
//        eventMulticaster.addListener(rainListener);
//        //通知天气
//        RainEvent ra = new RainEvent(even);
//        eventMulticaster.multicastEvent(ra);
//        //移除监听
//        eventMulticaster.removeListener(rainListener);
////        eventMulticaster.multicastEvent(ra);
//        StandardPBEStringEncryptor a = new StandardPBEStringEncryptor();
//        a.setPassword("qq");
//        String aa = a.encrypt("root@123");
//        System.out.println(aa);
//
//        System.out.println(a.decrypt("QPN01ehyuTm/alczbWawOFLJkiFhswO7"));
//        System.out.println(a.decrypt(aa));
    }
}