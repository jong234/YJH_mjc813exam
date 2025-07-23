package com.yjh.mymailtest.mpacrud.animal.controller;

import com.yjh.mymailtest.mpacrud.animal.dto.AnimalDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AnimalController {

    @GetMapping("/animal/a")
    public String testA(Model model
               ,@RequestParam("name1") String name1
               ,@RequestParam("name3") String name2
               ,@RequestParam("nam3") String nam3) {

        model.addAttribute("name1", "이름A");
        model.addAttribute("name2", "이름B");
        model.addAttribute("name3", "이름C");
        return "/a";
    }
    @GetMapping("/animal/addview")
    public String addView(){
        return "/animal/addview";
    }
    @PostMapping("/animal/insert")
    public String insert(@ModelAttribute AnimalDto animalDto){


        return "redirect:/";
    }
}
