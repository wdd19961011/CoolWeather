package com.example.coolweathertest.db;

import com.google.gson.annotations.SerializedName;

/**
 * Time:2019/11/7
 * Author:sz-dev
 * Description:
 * 包名：com.example.coolweathertest.db
 * 项目名称：CoolWeatherTest
 **/
public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
