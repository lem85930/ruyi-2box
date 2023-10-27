package com.github.tvbox.osc.beanry;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DxianluBean {

    /**
     "storeHouse":
     */
    @SerializedName("urls")
    public List<MsgDTO> storeHouse;

    public static class MsgDTO {
        /**
         "sourceName":"💚茶茶优选仓",
         "sourceUrl":"https://jihulab.com/duomv/apps/-/raw/main/a.txt"

         */

        @SerializedName("name")
        public String sourceName;
        @SerializedName("url")
        public String sourceUrl;
    }
}
