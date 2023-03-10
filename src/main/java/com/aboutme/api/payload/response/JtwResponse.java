package com.aboutme.api.payload.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class JtwResponse {
    private String token;
    private String type = "Bearer";
    private String id;
    private String email;
    private String name;
    private List<String> roles;

    public JtwResponse(String accessToken, String email, List<String> roles) {
        this.token = accessToken;
        this.email = email;
        this.roles = roles;
    }
}
