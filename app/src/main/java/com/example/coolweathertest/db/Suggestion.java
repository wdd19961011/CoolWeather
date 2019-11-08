package com.example.coolweathertest.db;

import com.google.gson.annotations.SerializedName;

/**
 * Time:2019/11/7
 * Author:sz-dev
 * Description:
 * 包名：com.example.coolweathertest.db
 * 项目名称：CoolWeatherTest
 **/
public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public CarCrash carCrash;
    public Sport sport;
    public class Comfort{
        @SerializedName("txt")
        public String info;
    }
    public class CarCrash{
        @SerializedName("txt")
        public String info;
    }
    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}
