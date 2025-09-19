package com.mjc813.contact_web.exception.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CommonExceptionTemplate extends Exception {

    private int code;
    private String message;

}
