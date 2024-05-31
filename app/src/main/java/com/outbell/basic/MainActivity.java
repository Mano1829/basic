package com.outbell.basic;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity  {

    private Context context = MainActivity.this ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Console.Log("MainActivity" , ResUtils.GetStringSRC(context , R.string.app_name));

        Toaster toaster = new Toaster(context);
        toaster.setGravityType(Gravity.LEFT);
        toaster.show(R.string.app_name);


        findViewById(R.id.buttonOne).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomAlertDialog alertDialog = new CustomAlertDialog(context);
                alertDialog.setTitle(new ViewSettings(R.string.app_name , 16 , null));
                alertDialog.setDesc(new ViewSettings("This is the Example for Custom Alert Dialog!!" , 16 , null));
                alertDialog.setButtonPositive(new ViewSettings("Ok", R.color.purple_200, 14, null), new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
                alertDialog.setNegativeButton(new ViewSettings("Cancel", R.color.teal_200, 14, null), new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
                alertDialog.show();
            }
        });
    }
}
