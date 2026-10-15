package com.zumrudu_anka.landmarkbook;

import android.graphics.Bitmap;

public class Globals {

    private Bitmap chosenimage;
    private static Globals instance;

    public Globals(){

    }

    public Bitmap getChosenimage() {
        return chosenimage;
    }

    public void setChosenimage(Bitmap chosenimage) {
        this.chosenimage = chosenimage;
    }

    public static Globals getInstance(){
        if(instance == null){
            instance=new Globals();
        }
        return instance;
    }
}
