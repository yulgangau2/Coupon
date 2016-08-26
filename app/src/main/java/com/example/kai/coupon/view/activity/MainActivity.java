package com.example.kai.coupon.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.kai.coupon.R;
import com.example.kai.coupon.view.util.ScreenUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int screenwidth = ScreenUtils.getInstance().getScreenWidth();
        int screeheight = ScreenUtils.getInstance().getScreenHeight();


        Toast.makeText(MainActivity.this,
                "Height is " + screeheight,
                Toast.LENGTH_LONG)
                .show();


    }
}