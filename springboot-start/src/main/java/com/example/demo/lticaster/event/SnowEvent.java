package com.example.demo.lticaster.event;

/**
 * 下雪事件
 */
public class SnowEvent extends WeatherEvent {

    private String aa = "";

    public SnowEvent(String a) {
        aa = a;
    }

    @Override
    public String getWeather() {
        return aa;
    }
}
