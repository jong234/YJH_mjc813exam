package com.mjc813.swimpool_app.swimLogin.service;

import com.mjc813.swimpool_app.swimLogin.dto.ISign;
import com.mjc813.swimpool_app.swimLogin.dto.SignDto;
import com.mjc813.swimpool_app.swimLogin.dto.SignEntity;
import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

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

    public List<ISign> findAll() {
        List<SignEntity> all = this.signRepository.findAll();
        List<ISign> result = all.parallelStream()
                .map(x -> (ISign)x).toList();
        return result;
    }

    public ISign findByIdRepository(Long id) throws Exception {
        Optional<SignEntity> find = this.signRepository.findById(id);
        if ( find.isPresent() ) {
            return find.get();
        } else {
            throw new NotFoundException(String.format("data cat not found [%d]", id));
        }
    }
}
