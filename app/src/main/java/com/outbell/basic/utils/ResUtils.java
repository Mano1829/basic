package com.outbell.basic.utils;

import android.content.Context;

public class ResUtils {

    public static String GetString(Context context , int stringResID) {
        return context.getResources().getString(stringResID);
    }

}
