package com.example.tapcount;

public class MyCounter {

    private int mCount;


    public MyCounter(){
        mCount = 0;
    }

    public void addCount(){
        mCount++;
    }

    public Integer getCount(){
        return mCount;
    }

    public void setZero(){
        mCount = 0;
    }

    public void MinusCount(){
        mCount--;
    }

}
