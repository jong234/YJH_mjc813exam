package com.yjh.mymailtest.swimpool.swim;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SwimDTO {
    private Long userId;
    private String name;
    private String ranes;
    private String rane_type;
    private String phone_number;
    private String email;
}
