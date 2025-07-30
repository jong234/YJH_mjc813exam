package com.yjh.cinemagroup.cinema_crud.cinema.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CinemaDto {
    private Long id;
    private String name;
    private Long genreId;
    private String playTime;
    private String casts;
    private String description;
    private Integer restrictAge;
}
