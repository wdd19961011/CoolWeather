package com.example.coolweathertest.db;

/**
 * Time:2019/11/7
 * Author:sz-dev
 * Description:
 * 包名：com.example.coolweathertest.db
 * 项目名称：CoolWeatherTest
 **/
public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
