package com.mjc813.cinema_crud.genre.service;

import com.mjc813.cinema_crud.genre.dto.GenreDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class GenreService {
    @Autowired
    private GenreMybatisMapper genreMybatisMapper;

    public void insert(GenreDto dto) {
        this.genreMybatisMapper.insert(dto);
    }

    public List<GenreDto> selectGenre() {
        return this.genreMybatisMapper.selectGenre();
    }
    public GenreDto selectIdGenre(Long id) {
        return this.genreMybatisMapper.selectIdGenre(id);
    }
}
