package com.mjc813.swimpool_app.swimLogin.dto;

import com.mjc813.swimpool_app.common.IIdName;
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
public class SignDto implements ISign {

    private Long id;

    private String name;

    private String username;

    private String password;

    private String email;

    private String phoneNumber;

    private String role;

    private Integer maxLock;
}
