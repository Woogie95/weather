package com.example.weather.repository;


import com.example.weather.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiaryRepository extends JpaRepository<Memo, Long> {

}
