package com.mjc813.swimpool_app.swimLogin.service;

import com.mjc813.swimpool_app.swimLogin.dto.ISign;
import com.mjc813.swimpool_app.swimLogin.dto.SignDto;
import com.mjc813.swimpool_app.swimLogin.dto.SignEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignService {

    @Autowired
    private SignRepository signRepository;

    public ISign insertRepository(SignDto dto) {
        SignEntity entity = new SignEntity();
        entity.copyMembers(dto);
        SignEntity result = this.signRepository.save(entity);
        return result;
    }

    public ISign updateRepository(SignDto dto) {
        return this.insertRepository(dto);
    }

    public Boolean deleteRepository(Long id) {
        this.signRepository.deleteById(id);
        return true;

    }
}
