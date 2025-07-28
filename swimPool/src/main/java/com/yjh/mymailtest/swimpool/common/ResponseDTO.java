package com.yjh.mymailtest.swimpool.common;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseDTO {
    private ResponseEnum responseEnum;
    private String message;
    private Object data;
}
