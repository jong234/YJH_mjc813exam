package com.yjh.cinemagroup.cinema_jpa.genre.service;

import com.yjh.cinemagroup.cinema_jpa.genre.dto.GenreDto;
import com.yjh.cinemagroup.cinema_jpa.genre.dto.GenreEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GenreService {
    @Autowired
    private GenreRepository genreMybatisMapper;

    public GenreEntity insert(GenreDto dto) {
        GenreEntity entity = new GenreEntity(null, dto.getName());
        this.genreMybatisMapper.save(entity);
        return entity;
    }

//    public List<GenreDto> selectGenre() {
//        return this.genreMybatisMapper.selectGenre();
//    }
//    public GenreDto selectIdGenre(Long id) {
//        return this.genreMybatisMapper.selectIdGenre(id);
//    }
//    public void updateGenre(GenreDto dto) {
//        this.genreMybatisMapper.updateGenre(dto);
//    }
//
//    public void deleteGenre(Long id) {
//        this.genreMybatisMapper.deleteGenre(id);
//    }
}
