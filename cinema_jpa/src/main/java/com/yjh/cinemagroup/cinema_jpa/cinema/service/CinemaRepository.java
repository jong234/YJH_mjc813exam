package com.yjh.cinemagroup.cinema_jpa.cinema.service;

import com.yjh.cinemagroup.cinema_jpa.cinema.dto.CinemaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CinemaRepository extends JpaRepository<CinemaEntity, Long> {
}
