package com.gavin.springdemo;


public class CricketCoach implements Coach {
    private FortuneService fortuneService;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "how to practice cricket I don't know";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
