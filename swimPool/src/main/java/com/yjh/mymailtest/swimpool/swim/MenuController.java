package com.yjh.mymailtest.swimpool.swim;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {

    @GetMapping("/swim")
    public String index() {
        return "/swim/index";
    }
    @GetMapping("/swim/list")
    public String list() {
        return "swim/list";
    }
}
