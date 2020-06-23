package com.gavin.springdemo;

public class TrackCoach implements  Coach {
    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "run a hard 5 k";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
