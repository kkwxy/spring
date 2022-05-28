package com.example.demo.lticaster.multicaster;

public class WeatherEventMulticaster extends AbstractEventMulticaster {

    @Override
    void doStart() {
        System.out.println("开始播报天气");
    }

    @Override
    void doEnd() {
        System.out.println("结束播报天气");
    }
}