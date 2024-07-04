package com.example.jv.PhoneExample;

public abstract class Phone {

    private Person owner;
    private String phoneName;

    public Phone(String phoneName){
        this.phoneName = phoneName;
    }

    abstract void showMsg();

    public void turnOn(){

        if(owner != null){
            System.out.println(owner.getName() + "님이 " + phoneName +"을 켰습니다.");
            showMsg();
        } else{
            System.out.println("주인 없는 " + phoneName +"이 켜졌습니다.");
            showMsg();
        }
    };


    public void setOwner(Person owner) {
        this.owner = owner;
        System.out.println(owner.getName() + "님이 "+ phoneName+"을 구매했습니다.");
    }
}
