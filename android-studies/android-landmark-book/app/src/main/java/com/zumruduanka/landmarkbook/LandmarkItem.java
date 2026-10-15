package com.zumruduanka.landmarkbook;

import android.graphics.Bitmap;

public class LandmarkItem {
    private final String name;
    private final String country;
    private final Bitmap image;

    public LandmarkItem(String name, String country, Bitmap image) {
        this.name = name;
        this.country = country;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public Bitmap getImage() {
        return image;
    }

}
