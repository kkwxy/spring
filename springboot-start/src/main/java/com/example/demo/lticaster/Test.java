package com.example.demo.lticaster;

import com.example.demo.lticaster.event.RainEvent;
import com.example.demo.lticaster.event.SnowEvent;
import com.example.demo.lticaster.listener.RainListener;
import com.example.demo.lticaster.listener.SnowListener;
import com.example.demo.lticaster.multicaster.WeatherEventMulticaster;

public class Test {

    public static void main(String[] args) {
        //广播
        WeatherEventMulticaster eventMulticaster = new WeatherEventMulticaster();
        //添加监听
        RainListener rainListener = new RainListener();
        SnowListener snowListener = new SnowListener();
        eventMulticaster.addListener(rainListener);
        eventMulticaster.addListener(snowListener);
        //通知天气
        eventMulticaster.multicastEvent(new SnowEvent());
        eventMulticaster.multicastEvent(new RainEvent());
        //移除监听
        eventMulticaster.removeListener(rainListener);
        eventMulticaster.multicastEvent(new SnowEvent());
        eventMulticaster.multicastEvent(new RainEvent());
    }
}