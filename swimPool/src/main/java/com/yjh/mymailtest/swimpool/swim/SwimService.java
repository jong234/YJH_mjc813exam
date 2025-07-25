package com.yjh.mymailtest.swimpool.swim;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SwimService {
    @Autowired
    private SwimMybatis swimMybatis;

    public void addSwim(SwimDTO swimDTO) {
        this.swimMybatis.addSwim(swimDTO);
    }
    public List<SwimDTO> getSwimList() {
        List<SwimDTO> list = this.swimMybatis.findAllSwim();
        return list;
    }
    public SwimDTO getSwimById(Long id) {
        SwimDTO swimDTO = this.swimMybatis.findSwimById(id);
        return swimDTO;
    }
    public void updateSwim(SwimDTO swimDTO) {
        this.swimMybatis.updateSwim(swimDTO);
    }
    public void deleteSwim(Long id) {
        this.swimMybatis.deleteSwim(id);
    }
}
