package com.shankaryadav.www.unsplashtesting;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Download implements Serializable {
    @SerializedName("url")
    @Expose
    private String url;
}
