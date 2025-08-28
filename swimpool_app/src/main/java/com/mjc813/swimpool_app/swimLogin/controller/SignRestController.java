package com.mjc813.swimpool_app.swimLogin.controller;

import com.mjc813.swimpool_app.common.CommonRestController;
import com.mjc813.swimpool_app.common.ResponseCode;
import com.mjc813.swimpool_app.common.ResponseDto;
import com.mjc813.swimpool_app.common.ResponseSignDto;
import com.mjc813.swimpool_app.swimLogin.dto.ISign;
import com.mjc813.swimpool_app.swimLogin.dto.SignDto;
import com.mjc813.swimpool_app.swimLogin.dto.SignEntity;
import com.mjc813.swimpool_app.swimLogin.service.SignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/sign")
public class SignRestController extends CommonRestController {
    @Autowired
    private SignService signService;

    @PostMapping("")
    public ResponseEntity<ResponseSignDto> insert(
            @Validated @RequestBody SignDto dto
    ) {
        try {
            ISign iIdName = this.signService.insertRepository(dto);
            return this.getReponseEntity(ResponseCode.SUCCESS, "OK", iIdName, null);
        } catch (Throwable th) {
            log.error(th.toString());
            return this.getReponseEntity(ResponseCode.INSERT_FAIL, "Error", dto, th);
        }
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ResponseSignDto> update(
            @PathVariable Long id
            , @Validated @RequestBody SignDto dto
    ) {
        try {
            dto.setId(id);
            ISign iIdName = this.signService.updateRepository(dto);
            return this.getReponseEntity(ResponseCode.SUCCESS, "OK", iIdName, null);
        } catch (Throwable th) {
            log.error(th.toString());
            return this.getReponseEntity(ResponseCode.UPDATE_FAIL, "Error", dto, th);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseSignDto> delete(
            @PathVariable Long id
    ){
        try {
            this.signService.deleteRepository(id);
            return this.getReponseEntity(ResponseCode.SUCCESS, "OK", true, null);
        } catch (Throwable th) {
            log.error(th.toString());
            return this.getReponseEntity(ResponseCode.UPDATE_FAIL, "Error", id, th);
        }
    }

    @GetMapping("")
    public ResponseEntity<ResponseSignDto> findAll() {
        try {
            List<ISign> list = signService.findAll();
            return this.getReponseEntity(ResponseCode.SUCCESS, "OK", list, null);
        } catch (Throwable th) {
            log.error(th.toString());
            return this.getReponseEntity(ResponseCode.NOTFOUND_FAIL, "Error", "", th);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseSignDto> findById(@PathVariable Long id){
        try {
            ISign sign = this.signService.findByIdRepository(id);
            return this.getReponseEntity(ResponseCode.SUCCESS, "OK", sign, null);
        } catch (Throwable th) {
            log.error(th.toString());
            return this.getReponseEntity(ResponseCode.NOTFOUND_FAIL, "Error", id, th);
        }
    }
}
