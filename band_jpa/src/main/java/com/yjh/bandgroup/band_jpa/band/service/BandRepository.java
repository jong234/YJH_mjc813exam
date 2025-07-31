package com.yjh.bandgroup.band_jpa.band.service;

import com.yjh.bandgroup.band_jpa.band.dto.BandEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BandRepository extends JpaRepository<BandEntity, Long> {
}
