package com.example.demo.lticaster.event;

/**
 * 下雨事件
 */
public class RainEvent extends WeatherEvent {
    @Override
    public String getWeather() {
        return "下雨了";
    }
}