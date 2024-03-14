package com.merion.retrofit.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostCreateRequest {
    private Integer userId;
    private String title;

    private  String body;

}
