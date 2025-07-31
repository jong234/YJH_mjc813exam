package com.yjh.bandgroup.band_jpa.band.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "BandEntity")
@Table(name =  "band_tbl")
public class BandEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, nullable = false)
    private String name;

    @Column(length = 20, nullable = false)
    private String leader;

    @Column(length = 20, nullable = false)
    private String guitarFirst;

    @Column(length = 20, nullable = false)
    private String guitarSecond;

    @Column(length = 20, nullable = false)
    private String drum;

    @Column(length = 20, nullable = false)
    private String 	bass;

    @Column(length = 20, nullable = false)
    private String keyboard;

    @Column(length = 20, nullable = false)
    private String vocal;
}
