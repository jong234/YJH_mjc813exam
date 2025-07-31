package com.yjh.bandgroup.band_jpa.band.controller;

import com.yjh.bandgroup.band_jpa.band.dto.BandDto;
import com.yjh.bandgroup.band_jpa.band.dto.BandEntity;
import com.yjh.bandgroup.band_jpa.band.service.BandService;
import com.yjh.bandgroup.band_jpa.common.ResponseDto;
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
@RequestMapping("/band")
public class BandRestController {
    @Autowired
    private BandService bandService;
    
    @PostMapping("")
    public ResponseEntity<ResponseDto> insert(@Validated @RequestBody BandDto dto) {
        try{
            BandEntity entity = bandService.insert(dto);
            ResponseDto result = ResponseDto.builder()
                    .message("success")
                    .resultCode(51111)
                    .resultData(entity)
                    .build();
            return ResponseEntity.ok(result);
        }catch (Throwable e){
            log.error(e.toString());
            ResponseDto result = ResponseDto.builder()
                    .message("error")
                    .resultCode(90000)
                    .resultData(dto)
                    .build();
            return ResponseEntity.status(500).body(result);
        }
    }
}
