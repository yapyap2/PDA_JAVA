package com.example.jv.PhoneExample;

public class Person implements PhoneUser{
    private String name;
    private Phone phone;


    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void buyPhone(Phone phone) {
        this.phone = phone;
        phone.setOwner(this);
    }

    @Override
    public void turnOnPhone() {
        if(this.phone == null){
            System.out.println(name + "은 폰이 없어요 ㅠ");
        } else{
            this.phone.turnOn();
        }
    }


}
