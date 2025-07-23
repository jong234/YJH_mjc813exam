package com.yjh.mymailtest.webcrud.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MemberRepository {
    @Autowired
    private IMemberMyvatis mybatisMapper;

    public void addMember(MemberDto member) {
        this.mybatisMapper.addMember(member);
    }

    public List<MemberDto> findAll() {
        List<MemberDto> list = this.mybatisMapper.findAll();
        return this.mybatisMapper.findAll();
    }
}

