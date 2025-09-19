package com.example.demo.controller;

import com.example.demo.member.Member;
import com.example.demo.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class TestController {
    private final MemberRepository memberRepository;

    @GetMapping("/test")
    public String test() {
        return "/test";
    }

    @GetMapping("/members")
    public List<Member> members() {
        return memberRepository.findAll();
    }

}
