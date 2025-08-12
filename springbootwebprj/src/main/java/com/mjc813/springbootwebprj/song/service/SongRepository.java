package com.mjc813.springbootwebprj.song.service;

import com.mjc813.springbootwebprj.common.ResponseDto;
import com.mjc813.springbootwebprj.song.dto.SongEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SongRepository extends JpaRepository<SongEntity,Long> {

}
