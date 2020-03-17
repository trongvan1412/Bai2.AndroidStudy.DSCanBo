package com.example.helloworld;

import android.util.Log;

public class NhanVien extends CanBo{
    private String job;
    private int expYear;

    public static final String TAG = "NhanVienActivity";

    public NhanVien(String name, int age, String sex, String address,String job,int expYear) {
        super(name, age, sex, address);
        this.job = job;
        this.expYear = expYear;
    }

    @Override
    public void display(){
        super.display();
        Log.e(TAG,"Job: " + this.job);
        Log.e(TAG,"Experiment Year: " + this.expYear);
    }
}
