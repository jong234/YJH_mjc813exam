package com.yjh.cinemagroup.cinema_crud.cinema.service;

import com.yjh.cinemagroup.cinema_crud.cinema.dto.CinemaDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CinemaMybatisMapper {

    public void insertCinema(CinemaDto cinemaDto);
}
