package com.mjc813.swimpool_app.swimLogin.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SignDto {

    private Long id;

    private String name;

    private String username;

    private String password;

    private String email;

    private String phone_number;

    private String role;

    private Integer maxLock;
}
