package com.jad.cartune.share;

public interface Tuning {
    String getName();

    String[] getSettingNames();

    void setSetting(String setting);

    String getSetting();

    String getEffect();

    char[][] getLayer();
}