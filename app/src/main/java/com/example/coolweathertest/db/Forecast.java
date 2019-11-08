package com.example.coolweathertest.db;

import com.google.gson.annotations.SerializedName;

/**
 * Time:2019/11/7
 * Author:sz-dev
 * Description:
 * 包名：com.example.coolweathertest.db
 * 项目名称：CoolWeatherTest
 **/
public class Forecast {
    public String date;
    @SerializedName("cond")
    public More more;
    @SerializedName("tmp")
    public Temperature temperature;
    public class More {
        @SerializedName("txt_d")
        public String info;
    }

    public class Temperature {
        public String max;
        public String min;
    }
}
