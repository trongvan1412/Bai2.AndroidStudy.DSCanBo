package com.example.helloworld;

import android.util.Log;

public class KySu extends CanBo{
    private String major;
    private String certificate;

    public static final String TAG = "KySu";


    public KySu(String name, int age, String sex, String address,String major,String certificate) {
        super(name, age, sex, address);
        this.major = major;
        this.certificate = certificate;
    }

    @Override
    public void display(){
        super.display();
        Log.e(TAG,"Major: " + this.major);
        Log.e(TAG,"Certificate : " + this.certificate);
    }
}
