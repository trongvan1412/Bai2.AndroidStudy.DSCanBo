package com.example.helloworld;

import android.util.Log;

public class CongNhan extends CanBo{
    private int level;
    private String healthStatus;

    public static final String TAG = "CongNhanACT";

    public CongNhan(String name, int age, String sex, String address,int level,String healthStatus) {
        super(name, age, sex, address);
        this.level = level;
        this.healthStatus = healthStatus;
    }

    @Override
    public void display(){
        super.display();
        Log.e(TAG,"Level: " + this.level);
        Log.e(TAG,"Health Status: " + this.healthStatus);
    }

}
