package com.gavin.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;
public class App {


    @Test
    public void testConstructorInjection() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach coach = context.getBean("myTrackCoach", Coach.class);
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());


    }

    @Test
    public void testSettingLiteralProperty() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CricketCoach ccoach = context.getBean("myCricketCoach", CricketCoach.class);
        System.out.println(ccoach.getDailyWorkout());
        System.out.println(ccoach.getDailyFortune());
        System.out.println(ccoach.getEmail());
        context.close();
    }
    @Test
    public void testRandomFortune() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CricketCoach ccoach = context.getBean("myCricketCoach", CricketCoach.class);
        for (int i = 0; i < 50; i++) {
            String fortune = ccoach.getDailyFortune();
            System.out.println(fortune);;
        }
        context.close();
    }

    @Test
    public void beanScopeAndLifeCycleTest() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach coach1 = context.getBean("myTrackCoach", Coach.class);
        Coach coach2 = context.getBean("myTrackCoach", Coach.class);
        System.out.println(coach1 == coach2);

        Coach coachping = context.getBean("myPingPongCoach", Coach.class);
        Coach coachpong = context.getBean("myPingPongCoach", Coach.class);
        System.out.println(coachping == coachpong);

    }



}
