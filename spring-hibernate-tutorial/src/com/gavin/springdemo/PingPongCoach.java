package com.gavin.springdemo;

import java.util.Random;

public class PingPongCoach implements  Coach{

    public int rating = new Random().nextInt();

    @Override
    public String getDailyWorkout() {
        return null;
    }

    @Override
    public String getDailyFortune() {
        return null;
    }

    public void init() {
        System.out.println("set up");
    }

    public void destroy() {
        System.out.println("destroy");
    }
}
