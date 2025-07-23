package com.yjh.mymailtest.coffe_crud.service;

import com.yjh.mymailtest.coffe_crud.coffe_data.CoffeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoffeeRepository {
    @Autowired
    private CoffeeMybatis coffeeMybatis;

    public void insertCoffee(CoffeeDTO coffee) {
        this.coffeeMybatis.insertCoffe(coffee);
    }
}
