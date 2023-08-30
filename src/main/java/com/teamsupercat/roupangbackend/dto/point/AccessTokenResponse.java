package com.teamsupercat.roupangbackend.dto.point;

import lombok.Data;


@Data
public class AccessTokenResponse {

    private Long code;
    private String message;
    private Response response;

}