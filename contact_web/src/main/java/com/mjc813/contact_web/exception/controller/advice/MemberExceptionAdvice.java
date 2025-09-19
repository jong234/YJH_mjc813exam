package com.mjc813.contact_web.exception.controller.advice;

import java.util.Map;

import com.mjc813.contact_web.exception.exception.CommonExceptionTemplate;
import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class MemberExceptionAdvice {

    @ExceptionHandler(CommonExceptionTemplate.class)
    public ResponseEntity<Map<String, Object>> handlerMemberException(CommonExceptionTemplate ex) {
        int code = ex.getCode();
        String message = ex.getMessage();

        return ResponseEntity.badRequest().body(Map.of("code", code, "message", message));
    }

}
