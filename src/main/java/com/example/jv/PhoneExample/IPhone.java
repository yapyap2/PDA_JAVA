package com.example.jv.PhoneExample;

public class IPhone extends Phone{


    public IPhone() {
        super("애플폰");
    }

    @Override
    void showMsg() {
        System.out.println("@@@ 폰 켜지는 중 @@@");
    }
}
