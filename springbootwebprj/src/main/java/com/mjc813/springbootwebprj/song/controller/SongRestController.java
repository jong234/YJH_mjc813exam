package com.mjc813.springbootwebprj.song.controller;

import com.mjc813.springbootwebprj.common.ResponseDto;
import com.mjc813.springbootwebprj.song.dto.SongEntity;
import com.mjc813.springbootwebprj.song.service.SongRepository;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.util.List;

import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/song")
public class SongRestController {
    @Autowired
    private SongRepository songRepository;

    @PostMapping("")
    public ResponseEntity<ResponseDto> insert(@RequestBody SongEntity songEntity) {
        try {
            this.songRepository.save(songEntity);
            return ResponseEntity.status(500).body(
                    ResponseDto.builder().resultCode(500).message("Success").resultData(songEntity).build()
            );
        }catch (Throwable throwable) {
            log.error(throwable.toString());
            return ResponseEntity.status(500).body(
              ResponseDto.builder().resultCode(999).message("ERROR").resultData(songEntity).build()
            );
        }
    }

    @PatchMapping("")
    public ResponseEntity<ResponseDto> update(@RequestBody SongEntity songEntity) {
        try {
            this.songRepository.save(songEntity);
            return ResponseEntity.status(500).body(
                    ResponseDto.builder().resultCode(500).message("Success").resultData(songEntity).build()
            );
        }catch (Throwable throwable) {
            log.error(throwable.toString());
            return ResponseEntity.status(500).body(
                    ResponseDto.builder().resultCode(999).message("ERROR").resultData(songEntity).build()
            );
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseDto> delete(@PathVariable Long id) {
        try {
            this.songRepository.deleteById(id);
            return ResponseEntity.status(500).body(
                    ResponseDto.builder().resultCode(500).message("Success").resultData(id).build()
            );
        }catch (Throwable throwable) {
            log.error(throwable.toString());
            return ResponseEntity.status(500).body(
                    ResponseDto.builder().resultCode(999).message("ERROR").resultData(id).build()
            );
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseDto> findbyId(@PathVariable Long id) {
        try {
            Optional<SongEntity> dto = this.songRepository.findById(id);
            return ResponseEntity.status(500).body(
                    ResponseDto.builder().resultCode(500).message("Success").resultData(dto).build()
            );
        }catch (Throwable throwable) {
            log.error(throwable.toString());
            return ResponseEntity.status(500).body(
                    ResponseDto.builder().resultCode(999).message("ERROR").resultData(id).build()
            );
        }
    }
    @GetMapping("")
    public ResponseEntity<ResponseDto> findall() {
        try {
            List<SongEntity> dto = this.songRepository.findAll();
            return ResponseEntity.status(500).body(
                    ResponseDto.builder().resultCode(500).message("Success").resultData(dto).build()
            );
        }catch (Throwable throwable) {
            log.error(throwable.toString());
            return ResponseEntity.status(500).body(
                    ResponseDto.builder().resultCode(999).message("ERROR").resultData(throwable).build()
            );
        }
    }

    @GetMapping("/titleContains")
    public ResponseEntity<ResponseDto> findByTitleContains(@RequestParam String title, Pageable pageable) {
        try {
            Page<SongEntity> page = this.songRepository.findByTitleContains(title, pageable);
            return ResponseEntity.status(500).body(
                    ResponseDto.builder().resultCode(500).message("Success").resultData(page).build());
        }catch (Throwable e){
            log.error(e.toString());
            return ResponseEntity.status(500).body(
                    ResponseDto.builder().resultCode(999).message("ERROR").resultData(null).build()
            );
        }
    }

}
