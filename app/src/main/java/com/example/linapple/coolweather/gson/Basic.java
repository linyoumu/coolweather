package com.example.linapple.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by linapple on 2018/9/16.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }

}
