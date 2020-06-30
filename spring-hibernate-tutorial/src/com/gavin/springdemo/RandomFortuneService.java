package com.gavin.springdemo;

import com.gavin.springdemo.FortuneService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomFortuneService implements FortuneService {

    private List<String> fortunes = Arrays.asList("good luck","bad luck","nothing special");

    @Override
    public String getFortune() {
        int size = fortunes.size();
        int index = new Random().nextInt(size);
        return fortunes.get(index);
    }
}
