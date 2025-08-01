package com.yjh.cinemagroup.cinema_jpa.cinema.dto;

import com.yjh.cinemagroup.cinema_jpa.genre.dto.GenreEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "CinemaEntity")
@Table(name = "cinema2_tbl")

public class CinemaEntity implements ICinema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20, unique = true)
    private String name;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    private GenreEntity genre;

    @Column(nullable = false, length = 20)
    private String playTime;

    @Column(nullable = false, length = 100)
    private String casts;

    @Column(length = 2000)
    private String description;

    @Column(nullable = false)
    private Integer restrictAge;

    @Override
    public Long getGenreId() {
        if(this.genre == null){
            return null;
        }
        return genre.getId();
    }

    @Override
    public void setGenreId(Long genreId) {
        if(this.genre == null){
            return;
        }
        genre.setId(genreId);
    }
}
