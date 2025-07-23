package com.yjh.mymailtest.mpacrud.animal.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class AnimalDto {
    private Long id;
    private String name;
    private Integer age;
    private String kind;


}
