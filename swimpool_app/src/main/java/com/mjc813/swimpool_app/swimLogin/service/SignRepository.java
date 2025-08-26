package com.mjc813.swimpool_app.swimLogin.service;

import com.mjc813.swimpool_app.swimLogin.dto.SignDto;
import com.mjc813.swimpool_app.swimLogin.dto.SignEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SignRepository extends JpaRepository<SignEntity, Long> {
}
