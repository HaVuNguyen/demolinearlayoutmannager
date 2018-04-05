package com.example.dell.demolinearlayoutmanager;

public class Music {
    private String tenBaiHat,tenCaSi,loiBaiHat;

    public Music() {
    }

    public Music(String tenBaiHat, String tenCaSi, String loiBaiHat) {
        this.tenBaiHat = tenBaiHat;
        this.tenCaSi = tenCaSi;
        this.loiBaiHat = loiBaiHat;
    }

    public String getTenBaiHat() {
        return tenBaiHat;
    }

    public void setTenBaiHat(String tenBaiHat) {
        this.tenBaiHat = tenBaiHat;
    }

    public String getTenCaSi() {
        return tenCaSi;
    }

    public void setTenCaSi(String tenCaSi) {
        this.tenCaSi = tenCaSi;
    }

    public String getLoiBaiHat() {
        return loiBaiHat;
    }

    public void setLoiBaiHat(String loiBaiHat) {
        this.loiBaiHat = loiBaiHat;
    }
}
