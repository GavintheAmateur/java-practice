package com.gavin.springdemo;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "today is your lucky day!";
    }
}