package com.yjh.mymailtest.webcrud.member;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IMemberMyvatis {
    public void addMember(MemberDto obj);
    public List<MemberDto> findAll();
}
