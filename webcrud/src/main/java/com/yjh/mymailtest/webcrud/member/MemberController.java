package com.yjh.mymailtest.webcrud.member;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {
    @Autowired
    private IMemberMyvatis memberRepository;

    @GetMapping("/member/")
    public String member() {
        return "member/index";
    }

    @GetMapping("/member/add")
    public String memberAdd() {
        return "member/add";
    }
    @PostMapping("/member/insert")
    public String memberInsert(@ModelAttribute MemberDto obj) {
        this.memberRepository.addMember(obj);
       return "redirect:/member/";
    }

    @GetMapping("/member/list")
    public String memberfind(Model model) {
        List<MemberDto> list = this.memberRepository.findAll();
        model.addAttribute("list", list);
        return "member/index";

    }
}
