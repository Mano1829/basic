package com.outbell.basic;

import android.content.Context;
import android.graphics.drawable.Drawable;

public class ResUtils {

    public static String GetStringSRC(Context context , int stringResID) {
        return context.getResources().getString(stringResID);
    }

    public static Drawable GetDrawableSRC(Context context , int drawableResID) {
        return context.getResources().getDrawable(drawableResID);
    }

    public static int GetColorSRC(Context context , int colorResID) {
        return context.getResources().getColor(colorResID);
    }

}
