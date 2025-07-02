package com.mjc813.contactjsp.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContactDto implements IContact {

    private Integer id;
    private String name;
    private String phoneNumber;
    private String zipNumber;
    private String email;

    @Override
    public String getContactFullInfo() {
        return "";
    }
}
