package com.yjh.mymailtest.coffe_crud.coffe_data;

import com.yjh.mymailtest.coffe_crud.service.CoffeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CoffeeController {
    @Autowired
    private CoffeeRepository coffeeRepository;

    @GetMapping("/coffee/")
    public String Coffeeindex() {
        return "/coffee/index";
    }

    @GetMapping("/coffee/insert")
    public String insertCoffee() {
        return "/coffee/insert";
    }

    @PostMapping("/coffee/add")
    public String insertCoffee(@ModelAttribute CoffeeDTO coffee) {
        this.coffeeRepository.insertCoffee(coffee);
        return "redirect:./";
    }

    @GetMapping("/coffee/list")
    public String selectAllCoffee(Model model) {
        List<CoffeeDTO> list = null;
       try{
           list = this.coffeeRepository.selectAllCoffee();
           model.addAttribute("listAll", list);
       }catch (Throwable throwable){
           throwable.printStackTrace();
       }
       return "/coffee/list";
    }

    @GetMapping("/coffee/update")
    public String updateCoffee(@RequestParam("id") Long id, Model model) {
            try {
                CoffeeDTO result = this.coffeeRepository
            }
        return "/coffee/update";
    }


}
