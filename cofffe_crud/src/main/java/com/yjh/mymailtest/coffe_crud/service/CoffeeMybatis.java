package com.yjh.mymailtest.coffe_crud.service;

import com.yjh.mymailtest.coffe_crud.coffe_data.CoffeeDTO;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface CoffeeMybatis {
    public void insertCoffe(CoffeeDTO coffee);
    public List<CoffeeDTO> selectAllCoffee();
    public void updateCoffee(CoffeeDTO coffee);
    public CoffeeDTO selectOneCoffee(Long id);
}
