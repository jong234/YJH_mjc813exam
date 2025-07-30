package com.yjh.cinemagroup.cinema_crud.cinema.controller;

import com.yjh.cinemagroup.cinema_crud.cinema.dto.CinemaDto;
import com.yjh.cinemagroup.cinema_crud.cinema.service.CinemaService;
import com.yjh.cinemagroup.cinema_crud.common.ResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/cinema")
public class CinemaRestController {

    @Autowired
    private CinemaService cinemaService;

    @PostMapping("")
    public ResponseEntity<ResponseDto> insertCinema(@Validated @RequestBody CinemaDto cinemaDto) {
        try {
            this.cinemaService.insertCinema(cinemaDto);
            return ResponseEntity.ok().body(
                    new ResponseDto("ok", 50010, cinemaDto)
            );
        } catch (Throwable e) {
            log.error(e.toString());
            return ResponseEntity.ok().body(
                    new ResponseDto("error", 90000, cinemaDto)
            );
        }
    }

}
