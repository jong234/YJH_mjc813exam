package com.mjc813.swimpool_app.common;

import org.springframework.http.ResponseEntity;

public class CommonRestController {
    public ResponseEntity<ResponseSignDto> getReponseEntity(ResponseCode code, String message, Object data, Throwable th) {
        if ( th == null ) {
            return ResponseEntity.ok().body(
                    ResponseSignDto.builder()
                            .code(code)
                            .message(message)
                            .result(data)
                            .build()
            );
        } else {
            return ResponseEntity.status(500).body(
                    ResponseSignDto.builder()
                            .code(code)
                            .message(message)
                            .result(data)
                            .build()
            );
        }
    }
}

