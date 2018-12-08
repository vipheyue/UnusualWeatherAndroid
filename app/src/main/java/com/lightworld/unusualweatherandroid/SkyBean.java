package com.lightworld.unusualweatherandroid;

public class SkyBean {
    String logo;
    String data;

    public SkyBean(String logo) {
        this.logo = logo;
    }

    public SkyBean(String logo, String data) {
        this.logo = logo;
        this.data = data;
    }
}
