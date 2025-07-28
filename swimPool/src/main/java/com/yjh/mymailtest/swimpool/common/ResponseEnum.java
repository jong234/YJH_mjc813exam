package com.yjh.mymailtest.swimpool.common;

public enum ResponseEnum {
    Sucess(0),
    SelectFail(40),
    InsertFail(50),
    UpdateFail(60),
    DeleteFail(70);

    private Integer code;
    ResponseEnum(Integer code){
        this.code = code;
    }
}
