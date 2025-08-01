package com.yjh.cinemagroup.cinema_jpa.cinema.service;


import com.yjh.cinemagroup.cinema_jpa.cinema.dto.CinemaDto;
import com.yjh.cinemagroup.cinema_jpa.cinema.dto.CinemaEntity;
import com.yjh.cinemagroup.cinema_jpa.cinema.dto.CinemaGenreDto;
import com.yjh.cinemagroup.cinema_jpa.genre.dto.GenreDto;
import com.yjh.cinemagroup.cinema_jpa.genre.dto.GenreEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CinemaService {
    @Autowired
    private CinemaRepository cinemaRepository;

    public void insertCinema(CinemaDto dto) {
        GenreEntity genreEntity = new GenreEntity();
        genreEntity.setId(dto.getGenreId());

        CinemaEntity cinemaEntity = new CinemaEntity();
        cinemaEntity.setGenre(genreEntity);
        cinemaEntity.copyMember(dto);
        cinemaRepository.save(cinemaEntity);
//        this.cinemaMybatisMapper.insertCinema(dto);
    }

    @Transactional
    public void insertCinemaWithGenre(CinemaGenreDto dto) {
//        GenreDto genreDto = new GenreDto();
//        genreDto.setName(dto.getGenreName());
//
//        this.genreMybatisMapper.insert(genreDto);
//        dto.setGenreId(genreDto.getId());
//
//        this.cinemaMybatisMapper.insertCinema(dto);
//        dto.setGenreName(genreDto.getName());
    }

    public CinemaDto findById(Long id) {
//        return this.cinemaMybatisMapper.findById(id);
        return null;
    }

    public List<CinemaGenreDto> findByWhere() {
//        return this.cinemaMybatisMapper.findByWhere();
        return null;
    }

    public void update(CinemaDto dto) {
//        this.cinemaMybatisMapper.update(dto);

    }
    public void delete(Long id) {
//        this.cinemaMybatisMapper.delete(id);
    }
}
