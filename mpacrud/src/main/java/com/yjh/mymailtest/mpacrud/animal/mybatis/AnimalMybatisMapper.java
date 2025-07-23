package com.yjh.mymailtest.mpacrud.animal.mybatis;

import com.yjh.mymailtest.mpacrud.animal.dto.AnimalDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AnimalMybatisMapper {
    public void insertAnimal(AnimalDto animalDto);
}
