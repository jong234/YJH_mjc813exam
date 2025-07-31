package com.mjc813.cinema_crud.genre.service;

import com.mjc813.cinema_crud.genre.dto.GenreDto;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
@Mapper
public interface GenreMybatisMapper {
    public void insert(GenreDto dto);
    List<GenreDto> selectGenre();
    GenreDto selectIdGenre(Long id);
    void updateGenre(GenreDto dto);
    void deleteGenre(Long id);
}
