package com.yjh.bandgroup.band_jpa.band.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class BandDto {
    private long    id;
    private String  name;
    private String  leader;
    private String  guitarFirst;
    private String  guitarSecond;
    private String  drum;
    private String  bass;
    private String  keyboard;
    private String  vocal;
}
