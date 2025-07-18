package com.mjc813.contact_web;

import com.mjc813.contact_web.dto.Contact;
import com.mjc813.contact_web.service.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/contact")
public class ContactController {
    @Autowired
    private ContactRepository contactRepository;

    @GetMapping("/add")
    public String addView() {
        return "contact/add";
    }

    @PostMapping("/addconfirm")
    public String addConfirm(@ModelAttribute Contact inputContact) {
        try {
            System.out.printf("DB insert 전 : %s\n", inputContact.getContactFullInfo());
            contactRepository.insert(inputContact);
            System.out.printf("DB insert 후 : %s\n", inputContact.getContactFullInfo());
        } catch (Throwable e) {
            System.out.println(e.toString());
        }
        return "redirect:/contact/list";
    }

    @GetMapping("/list")
    public String selectAll(Model model) {
        List<Contact> contacts = null;
        try {
            contacts = this.contactRepository.selectAll();
        } catch (Throwable e) {
            System.out.println(e.toString());
        }
        model.addAttribute("contacts", contacts);
        return "contact/list";
    }

    @GetMapping("/view")
    public String selectOne(Model model, @RequestParam("id") Long id) {
        Contact contact = null;
        try {
            contact = this.contactRepository.selectOne(id);
            model.addAttribute("contact", contact);
        }catch (Throwable e) {
            System.out.println(e.toString());
        }
        return "contact/view";
    }

    @GetMapping("/modify")
    public String update(@RequestParam("id") Long id, Model model) {
        try{
            Contact contact = this.contactRepository.selectOne(id);
            model.addAttribute("dto", contact);
        }catch (Throwable e) {
            System.out.println(e.toString());
        }
        return "contact/modify";
    }
    @PostMapping("/update")
    public String update(@ModelAttribute Contact dto) {
        try {
                contactRepository.update(dto);
            // sql 의 update 문장을 실행한다.
        } catch (Throwable e) {
            System.out.println(e.toString());
        }
        return "redirect:/contact/list";// 정상 실행하면 redirect:/contact/contactlist
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute Contact dto) {
        try {
           contactRepository.delete(dto.getId());
        }catch (Throwable e) {
            System.out.println(e.toString());
        }
        return "redirect:/contact/list";
    }
}
