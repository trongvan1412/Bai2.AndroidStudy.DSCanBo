package com.example.helloworld;

import android.util.Log;

public class CanBo {
    private String name;
    private int age;
    private String sex;
    private String address;


    public static final String TAG = "CanBoActivity";

    public CanBo(String name, int age, String sex, String address) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
    }

    public CanBo(CanBo cb){
        this.name = cb.getName();
        this.age = cb.getAge();
        this.sex = cb.getSex();
        this.address = cb.getAddress();
    }

    public void display(){
        Log.e(TAG,"Name: " + name);
        Log.e(TAG,"Age: " + age);
        Log.e(TAG,"Sex: " + sex);
        Log.e(TAG,"Address: " + address);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getAddress() {
        return address;
    }
}
