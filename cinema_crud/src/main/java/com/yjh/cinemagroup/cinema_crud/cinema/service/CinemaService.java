package com.yjh.cinemagroup.cinema_crud.cinema.service;

import com.yjh.cinemagroup.cinema_crud.cinema.dto.CinemaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CinemaService {
    @Autowired
    private CinemaMybatisMapper cinemaMybatisMapper;

    public void insertCinema(CinemaDto cinemaDto) {
       this.cinemaMybatisMapper.insertCinema(cinemaDto);
    }
}
