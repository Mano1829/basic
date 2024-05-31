package com.outbell.basic;

import android.graphics.Typeface;
import android.view.Gravity;


public class ViewSettings {

    public String text = "" ;
    public int textResID , textColor = R.color.black , background = R.color.transparent ;
    public float textSize = 14.0f ;
    public Typeface typeface = null ;
    public int textGravity = Gravity.LEFT , buttonGravity = Gravity.CENTER  ;

    public ViewSettings(String text , float textSize , Typeface typeface) {
        this.text = text ;
        this.textSize = textSize ;
        this.typeface = typeface ;
    }

    public ViewSettings(int textResID , float textSize , Typeface typeface) {
        this.textResID = textResID ;
        this.textSize = textSize ;
        this.typeface = typeface ;
    }

    public ViewSettings(String text , int background , float textSize , Typeface typeface) {
        this.text = text ;
        this.background = background ;
        this.textSize = textSize ;
        this.typeface = typeface ;
    }

    public ViewSettings(int textResID , int background , float textSize , Typeface typeface) {
        this.textResID = textResID ;
        this.background = background ;
        this.textSize = textSize ;
        this.typeface = typeface ;
    }

    public ViewSettings(String text , int background , float textSize , int textColor , Typeface typeface) {
        this.text = text ;
        this.background = background ;
        this.textSize = textSize ;
        this.textColor = textColor ;
        this.typeface = typeface ;
    }

    public ViewSettings(int textResID , int background , float textSize , int textColor , Typeface typeface) {
        this.textResID = textResID ;
        this.background = background ;
        this.textSize = textSize ;
        this.textColor = textColor ;
        this.typeface = typeface ;
    }

    public ViewSettings(String text , int background , float textSize , int textColor , int textGravity , Typeface typeface) {
        this.text = text ;
        this.background = background ;
        this.textSize = textSize ;
        this.textColor = textColor ;
        this.typeface = typeface ;
        this.textGravity = textGravity ;
        this.buttonGravity = textGravity ;
    }

    public ViewSettings(int textResID , int background , float textSize , int textColor , int textGravity , Typeface typeface) {
        this.textResID = textResID ;
        this.background = background ;
        this.textSize = textSize ;
        this.textColor = textColor ;
        this.typeface = typeface ;
        this.textGravity = textGravity ;
        this.buttonGravity = textGravity ;
    }
}
