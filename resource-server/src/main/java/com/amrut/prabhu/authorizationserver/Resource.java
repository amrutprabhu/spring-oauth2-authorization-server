package com.amrut.prabhu.authorizationserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Resource {

    @GetMapping("/messages")
    public String getMessages(){
        return " OK you got the messages.";
    }
}
