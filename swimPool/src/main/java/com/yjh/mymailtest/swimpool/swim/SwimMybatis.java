package com.yjh.mymailtest.swimpool.swim;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface SwimMybatis {
    public void addSwim(SwimDTO swimDTO);
    public List<SwimDTO> findAllSwim();
    public SwimDTO findSwimById(Long id);
    public void updateSwim(SwimDTO swimDTO);
    public void deleteSwim(Long id);

}
