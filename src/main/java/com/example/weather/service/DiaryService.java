package com.example.weather.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class DiaryService {

    @Value("openweathermap.key")
    private String apiKey;

    public void createDiary(LocalDate date, String text) {

    }

    private String getWeatherString() {

    }

}
