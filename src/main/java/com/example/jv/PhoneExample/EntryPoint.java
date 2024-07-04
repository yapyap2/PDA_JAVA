package com.example.jv.PhoneExample;

public class EntryPoint {

    public static void main(String[] args) {

        Person jobs = new Person("잡스");
        Phone iphone = new IPhone();

        jobs.buyPhone(iphone);
        jobs.turnOnPhone();

        System.out.println("\n");

        Person dragon = new Person("재용");
        Phone galaxy = new SamsungPhone();

        dragon.buyPhone(galaxy);
        dragon.turnOnPhone();

    }

}
