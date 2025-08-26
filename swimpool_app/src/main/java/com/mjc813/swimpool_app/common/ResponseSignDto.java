package com.mjc813.swimpool_app.common;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ResponseSignDto {
    private ResponseCode code;
    private String message;
    private Object result;
}
