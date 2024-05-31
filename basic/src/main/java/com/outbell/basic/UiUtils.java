package com.outbell.basic;

import android.view.View;

public class UiUtils {

    public static void ChangeLayoutVisibility(View view , int visibleType) {
        if(view.getVisibility() != visibleType) view.setVisibility(visibleType);
    }

}
