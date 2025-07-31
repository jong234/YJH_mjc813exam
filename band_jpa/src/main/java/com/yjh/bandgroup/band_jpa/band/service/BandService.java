package com.yjh.bandgroup.band_jpa.band.service;

import com.yjh.bandgroup.band_jpa.band.dto.BandDto;
import com.yjh.bandgroup.band_jpa.band.dto.BandEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BandService {
    @Autowired
    private BandRepository bandRepository;

    public BandEntity insert(BandDto dto) {
        BandEntity entity = new BandEntity(null, dto.getName(), dto.getLeader(), dto.getGuitarFirst(), dto.getGuitarSecond(),dto.getDrum(),dto.getBass(),dto.getKeyboard(),dto.getVocal());
        return bandRepository.save(entity);


    }
}
