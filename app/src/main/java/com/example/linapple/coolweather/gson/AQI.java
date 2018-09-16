package com.example.linapple.coolweather.gson;

/**
 * Created by linapple on 2018/9/16.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;

        public String pm25;
    }
}
