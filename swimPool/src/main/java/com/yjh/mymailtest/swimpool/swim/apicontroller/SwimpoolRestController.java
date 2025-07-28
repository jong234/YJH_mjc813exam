package com.yjh.mymailtest.swimpool.swim.apicontroller;


import com.yjh.mymailtest.swimpool.swim.dto.SwimDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/swim")
public class SwimpoolRestController {
    @GetMapping("/list")
    public ResponseEntity<String> list() {
        List<SwimDTO> list = new ArrayList<>();
        list.add(new SwimDTO(1, "n1", 4, "222", "333", "444" ));
        list.add(new SwimDTO(2, "n2", 4, "622", "553", "424" ));
        list.add(new SwimDTO(3, "n3", 4, "332", "443", "464" ));
        return new ResponseEntity<>(list.toString(), HttpStatus.OK);
    }

}
