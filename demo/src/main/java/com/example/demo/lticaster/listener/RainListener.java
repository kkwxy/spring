package com.example.demo.lticaster.listener;

import com.example.demo.lticaster.event.RainEvent;
import com.example.demo.lticaster.event.SnowEvent;
import com.example.demo.lticaster.event.WeatherEvent;

/**
 * 监听下雪
 */
public class RainListener implements WeatherListener {
    @Override
    public void onWeatherEvent(WeatherEvent event) {
        if (event instanceof RainEvent) {
            System.out.println("hello " + event.getWeather());
        }
    }
}