package com.example.coolweathertest.db;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Time:2019/11/7
 * Author:sz-dev
 * Description:
 * 包名：com.example.coolweathertest.db
 * 项目名称：CoolWeatherTest
 **/
public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
