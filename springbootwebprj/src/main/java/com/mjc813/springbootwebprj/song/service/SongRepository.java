package com.mjc813.springbootwebprj.song.service;

import com.mjc813.springbootwebprj.song.dto.SongEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SongRepository extends JpaRepository<SongEntity,Long> {
    Page<SongEntity> findByTitleContains(String title, Pageable pageable);
}
