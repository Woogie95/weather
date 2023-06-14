package com.example.weather.controller;

import com.example.weather.service.DiaryService;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
@AllArgsConstructor
public class DiaryController {

    private final DiaryService diaryService;

    @PostMapping("/create/diary")
    public void createDiary(@RequestParam @DateTimeFormat(iso=DateTimeFormat.ISO.DATE)LocalDate date,
                            @RequestBody String text) {

    }
}
