package com.mjc813.swimpool_app.swimLogin.controller;

import com.mjc813.swimpool_app.common.CommonRestController;
import com.mjc813.swimpool_app.common.ResponseCode;
import com.mjc813.swimpool_app.common.ResponseDto;
import com.mjc813.swimpool_app.common.ResponseSignDto;
import com.mjc813.swimpool_app.swimLogin.dto.ISign;
import com.mjc813.swimpool_app.swimLogin.dto.SignDto;
import com.mjc813.swimpool_app.swimLogin.service.SignService;
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

}
