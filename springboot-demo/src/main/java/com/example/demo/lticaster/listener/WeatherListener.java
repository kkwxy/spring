package com.example.demo.lticaster.listener;

import com.example.demo.lticaster.event.WeatherEvent;

/**
 * 监听事件
 */
public interface WeatherListener {

    //处理监听事件
    void onWeatherEvent(WeatherEvent event);
}
