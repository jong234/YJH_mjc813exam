package com.yjh.mymailtest.coffe_crud.service;

import com.yjh.mymailtest.coffe_crud.coffe_data.CoffeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CoffeeRepository {
    @Autowired
    private CoffeeMybatis coffeeMybatis;

    public void insertCoffee(CoffeeDTO coffee) {
        this.coffeeMybatis.insertCoffe(coffee);
    }

    public List<CoffeeDTO> selectAllCoffee() {
        return this.coffeeMybatis.selectAllCoffee();
    }


    public CoffeeDTO selectOneCoffee(Long id) {
      return this.coffeeMybatis.selectOneCoffee(id);
    }

    public void updateCoffee(CoffeeDTO coffee) {
        this.coffeeMybatis.updateCoffee(coffee);
    }
    public CoffeeDTO deleteCoffee(Long id) {
        return this.coffeeMybatis.deleteCoffee(id);
    }
}
