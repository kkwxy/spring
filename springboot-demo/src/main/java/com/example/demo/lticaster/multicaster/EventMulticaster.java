package com.example.demo.lticaster.multicaster;

import com.example.demo.lticaster.event.WeatherEvent;
import com.example.demo.lticaster.listener.WeatherListener;

public interface EventMulticaster {

    // 广播事件
    void multicastEvent(WeatherEvent event);

    // 添加监听器
    void addListener(WeatherListener weatherListener);

    //移除监听器
    void removeListener(WeatherListener weatherListener);

}