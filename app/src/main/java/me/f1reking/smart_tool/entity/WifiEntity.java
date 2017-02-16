package me.f1reking.smart_tool.entity;

/**
 * Author: HuangYH.
 * Date: 2017/2/4.
 * Desc:
 */

public class WifiEntity {

    private String ssid;
    private String psk;

    public String getPsk() {
        return psk;
    }

    public void setPsk(String psk) {
        this.psk = psk;
    }

    public String getSsid() {
        return ssid;
    }

    public void setSsid(String ssid) {
        this.ssid = ssid;
    }

    @Override
    public String toString() {
        return "WifiEntity{" +
            "psk='" + psk + '\'' +
            ", ssid='" + ssid + '\'' +
            '}';
    }
}
