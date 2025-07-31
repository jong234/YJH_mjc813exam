package com.yjh.cinemagroup.cinema_jpa.genre.service;

import com.yjh.cinemagroup.cinema_jpa.genre.dto.GenreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<GenreEntity, Long> {
}
