package com.example.Login;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/")
public class Controller {
    @GetMapping
    public Map<String,Object> currrentUSer(OAuth2AuthenticationToken oAuth2AuthenticationToken){
        return  oAuth2AuthenticationToken.getPrincipal().getAttributes();
    }
}
