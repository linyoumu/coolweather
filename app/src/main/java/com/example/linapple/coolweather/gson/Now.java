package com.example.linapple.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by linapple on 2018/9/16.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }

}
