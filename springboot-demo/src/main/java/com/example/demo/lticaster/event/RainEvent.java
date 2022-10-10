package com.example.demo.lticaster.event;

/**
 * 下雨事件
 */
public class RainEvent extends WeatherEvent {
    private String aa = "";

    public RainEvent(String a) {
        aa = a;
    }

    @Override
    public String getWeather() {
        return aa;
    }
}