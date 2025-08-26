package com.mjc813.swimpool_app.swimLogin.dto;

import com.mjc813.swimpool_app.common.IIdName;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "SignEntity")
@Table(name = "user_tbl")
@Builder
public class SignEntity implements ISign {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String name;

    @Column(nullable = false, length = 20)
    private String username;

    @Column(nullable = false, length = 20)
    private String password;

    @Column(nullable = false, length = 30)
    private String email;

    @Column(nullable = false, length = 20)
    private String phoneNumber;

    @Column(nullable = false, length = 20)
    private String role;

    @Column(nullable = false)
    private Integer maxLock;

}
