package com.mjc813.springbootwebprj.song.dto;

import com.mjc813.springbootwebprj.genre.dto.GenreEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "SongEntity")
@Table (name = "song_tbl")
public class SongEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 50)
    private String title;

    @ManyToOne
    @JoinColumn(name = "genre_id", nullable = false)
    private GenreEntity genre;

    @Column(length = 50, nullable = false)
    private String composer;

    @Column(length = 50, nullable = false)
    private String artist;

    private LocalDate releaseDate;

}
