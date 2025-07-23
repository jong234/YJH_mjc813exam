package com.yjh.mymailtest.coffe_crud.service;

import com.yjh.mymailtest.coffe_crud.coffe_data.CoffeeDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CoffeeMybatis {
    public void insertCoffe(CoffeeDTO coffee);
}
