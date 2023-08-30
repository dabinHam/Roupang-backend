package com.teamsupercat.roupangbackend.dto.point;

import lombok.Data;

@Data
public class Response {
    private String access_token;
    private long expired_at;
    private long now;
}