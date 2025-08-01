package com.yjh.bandgroup.band_jpa.band.controller;

import com.yjh.bandgroup.band_jpa.band.dto.BandDto;
import com.yjh.bandgroup.band_jpa.band.dto.BandEntity;
import com.yjh.bandgroup.band_jpa.band.service.BandService;
import com.yjh.bandgroup.band_jpa.common.ResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.util.List;

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

    @GetMapping("")
    public ResponseEntity<ResponseDto> findAll() {
        try {
            List<BandEntity> list = bandService.findAll();
            ResponseDto result = ResponseDto.builder()
                    .message("success")
                    .resultCode(51111)
                    .resultData(list)
                    .build();
            return ResponseEntity.ok(result);
        }catch (Throwable e){
            log.error(e.toString());
            ResponseDto result = ResponseDto.builder()
                    .message("error")
                    .resultCode(90000)
                    .resultData(null)
                    .build();
            return ResponseEntity.status(500).body(result);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseDto> findById(@PathVariable Long id) {
        try {
            BandEntity entity = bandService.findById(id);
            ResponseDto result = ResponseDto.builder()
                    .message("success")
                    .resultCode(52222)
                    .resultData(entity)
                    .build();
            return ResponseEntity.ok(result);
        }catch (Throwable e){
            log.error(e.toString());
            ResponseDto result = ResponseDto.builder()
                    .message("error")
                    .resultCode(90000)
                    .resultData(null)
                    .build();
            return ResponseEntity.status(500).body(result);
        }
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ResponseDto> update(@RequestBody BandEntity dto) {
        try {
            bandService.update(dto);
            ResponseDto result = ResponseDto.builder()
                    .message("success")
                    .resultCode(53333)
                    .resultData(dto)
                    .build();
            return ResponseEntity.ok(result);
        }catch (Throwable e){
            log.error(e.toString());
            ResponseDto result = ResponseDto.builder()
                    .message("error")
                    .resultCode(90000)
                    .resultData(null)
                    .build();
            return ResponseEntity.status(500).body(result);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseDto> delete(@PathVariable Long id) {
        try {
            bandService.delete(id);
            ResponseDto result = ResponseDto.builder()
                    .message("success")
                    .resultCode(53333)
                    .resultData(id)
                    .build();
            return ResponseEntity.ok(result);
        }catch (Throwable e){
            log.error(e.toString());
            ResponseDto result = ResponseDto.builder()
                    .message("error")
                    .resultCode(90000)
                    .resultData(null)
                    .build();
            return ResponseEntity.status(500).body(result);
        }
    }
}
