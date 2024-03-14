package com.merion.retrofit.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PostResponse {
    private Integer id;
    private Integer userId;
    private String title;

    private String body;
}
