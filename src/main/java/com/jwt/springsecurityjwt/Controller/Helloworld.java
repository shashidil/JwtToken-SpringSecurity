package com.jwt.springsecurityjwt.Controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {
    @RequestMapping({ "/hello" })
    public String firstPage() {
        return "Hello World";
    }
}
