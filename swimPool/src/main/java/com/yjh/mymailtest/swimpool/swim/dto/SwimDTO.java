package com.yjh.mymailtest.swimpool.swim.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class SwimDTO {
    private Integer userId;
    private String name;
    private Integer lanes;
    private String lane_type;
    private String phone_number;
    private String email;
}
