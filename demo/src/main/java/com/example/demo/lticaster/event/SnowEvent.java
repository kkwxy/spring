package com.example.demo.lticaster.event;

/**
 * 下雪事件
 */
public class SnowEvent extends WeatherEvent {
    @Override
    public String getWeather() {
        return "下雪了";
    }
}
