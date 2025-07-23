package com.yjh.mymailtest.coffe_crud.coffe_data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CoffeeDTO {

    private Long id;
    private String name;
    private String price;
    private String source;
    private String shots;
}
