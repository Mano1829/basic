package com.outbell.basic;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

public class Toaster {

    public static final int GRAVITY_BOTTOM = Gravity.BOTTOM ;
    public static final int GRAVITY_CENTER = Gravity.CENTER ;
    public static final int GRAVITY_TOP = Gravity.TOP ;

    private Context context ;
    private int gravityType = GRAVITY_BOTTOM ;
    private int duration = Toast.LENGTH_SHORT ;
    private String message = "" ;

    public Toaster(Context context) {
        this.context = context ;
    }

    public void setGravityType(int gravityType) {
        this.gravityType = gravityType ;
    }

    public void setDuration(int duration) {
        this.duration = duration ;
    }

    public void show(int messageID) {
        this.message = ResUtils.GetStringSRC(context , messageID);
        show();
    }

    public void show(String message) {
        this.message = message ;
        show();
    }

    private void show() {
        Toast toast = Toast.makeText(context , message , duration);

        int yOffset = 0 ;
        boolean show = true ;
        if(gravityType == GRAVITY_BOTTOM) yOffset = 50 ;
        else if(gravityType == GRAVITY_TOP) yOffset = 100 ;
        else if(gravityType == GRAVITY_CENTER) yOffset = 0 ;
        else show = false ;

        if(show) {
            toast.setGravity(gravityType , 0 , yOffset);
            toast.show();
        }
        else {
            Console.Log("Toaster" , "Invalid Gravity Type!!");
        }
    }

}
