package com.mjc813.cinema_crud.genre.controller;

import com.mjc813.cinema_crud.common.ResponseDto;
import com.mjc813.cinema_crud.genre.dto.GenreDto;
import com.mjc813.cinema_crud.genre.service.GenreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@Slf4j
@RestController
@RequestMapping("/genre")
public class GenreRestController {
    @Autowired
    private GenreService genreService;

    @PostMapping("")
    public ResponseEntity<ResponseDto> insert(@Validated @RequestBody GenreDto dto) {
        try {
            this.genreService.insert(dto);
            ResponseDto result = ResponseDto.builder()
                    .message("success")
                    .resultCode(50010)
                    .resultData(dto)
                    .build();
            return ResponseEntity.ok(result);
        } catch (Throwable e) {
            log.error(e.toString());
            ResponseDto result = ResponseDto.builder()
                    .message("error")
                    .resultCode(90000)
                    .resultData(null)
                    .build();
            return ResponseEntity.status(500).body(result);
        }
    }

    @GetMapping("/list")
    public ResponseEntity<ResponseDto> selectGenre() {
        try {
            List<GenreDto> list = this.genreService.selectGenre();
            return ResponseEntity.ok().body(
                new ResponseDto("success", 60001, list)
            );
        }catch (Throwable e) {
            log.error(e.toString());
            return ResponseEntity.ok().body(
                    new ResponseDto("selectAll error", 90000, null)
            );
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseDto> selectById(@PathVariable Long id) {
        try {
            GenreDto dto = this.genreService.selectIdGenre(id);
            return ResponseEntity.ok().body(
                    new ResponseDto("success", 60010, dto)
            );
        }catch (Throwable e) {
            log.error(e.toString());
            return ResponseEntity.ok().body(
                    new ResponseDto("selectById error", 90000, null)
            );
        }
    }

    @PatchMapping("")
    public ResponseEntity<ResponseDto> update(@RequestBody GenreDto dto) {
        try {
            dto.setId(this.genreService.selectIdGenre(dto.getId()).getId());
            this.genreService.updateGenre(dto);
            return ResponseEntity.ok().body(
                    new ResponseDto("success", 60020, dto)
            );
        }catch (Throwable e) {
            log.error(e.toString());
            return ResponseEntity.ok().body(
                    new ResponseDto("updateById error", 90000, null)
            );
        }
    }

}
