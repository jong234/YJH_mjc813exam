package com.mjc813.swimpool_app.swimLogin.service;

import com.mjc813.swimpool_app.swimLogin.dto.SignDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SignRepository extends JpaRepository<SignDto, Long> {
}
