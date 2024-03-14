package com.merion.retrofit.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostUodateRequest {
    private Integer id;
    private Integer userId;
    private String title;

    private  String body;
}
