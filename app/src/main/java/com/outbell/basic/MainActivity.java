package com.outbell.basic;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.outbell.basic.utils.Console;
import com.outbell.basic.utils.ResUtils;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Console.Log("MainActivity" , ResUtils.GetString(MainActivity.this , R.string.app_name));
    }
}
