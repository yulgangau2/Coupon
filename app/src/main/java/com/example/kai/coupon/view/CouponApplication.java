package com.example.kai.coupon.view;

import android.app.Application;

import com.inthecheesefactory.thecheeselibrary.manager.Contextor;

/**
 * Created by Kai on 18/8/2559.
 */
public class CouponApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //initilize
        Contextor.getInstance().init(getApplicationContext());
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
