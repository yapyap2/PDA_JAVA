package com.example.jv.PhoneExample;

public class SamsungPhone extends Phone{

    public SamsungPhone() {
        super("삼송폰");
    }

    @Override
    void showMsg() {
        System.out.println("*** 폰 켜지는 중 ***");
    }
}
