package com.mjc813.swimpool_app.swimpool.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SwimpoolSearchDto extends SwimpoolDto {
    private Integer curPage;
    private Integer rowsPage;
    private Integer offset;

}
