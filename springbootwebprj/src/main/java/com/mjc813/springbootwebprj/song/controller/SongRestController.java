package com.mjc813.springbootwebprj.song.controller;

import com.mjc813.springbootwebprj.common.ResponseDto;
import com.mjc813.springbootwebprj.song.dto.SongEntity;
import com.mjc813.springbootwebprj.song.service.SongRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
}
